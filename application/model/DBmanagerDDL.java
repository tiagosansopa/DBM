package application.model;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader; 

public class DBmanagerDDL {

	

	String actualDatabase = "";
	
	public DBmanagerDDL() 
	{
		
	}
	
	
	public String getActualDatabase() 
	{
		return actualDatabase;
	}
	
	
	/**
	 * Create Database given name
	 * If it exists already, notifies.
	**/
	public String createDatabase(String nameDatabase)
	{
		File theDir = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+nameDatabase);
		if (!theDir.exists()) 
		{
			try
			{
				theDir.mkdir();
			} 
			catch(SecurityException se)
			{
			}        
			actualDatabase = theDir.getName();
			return "";
		}
		else{
			return "DATABASE " + theDir.getName() + " ALREADY EXISTS";
		}
	}
	
	/**
	 * Rename given database
	**/
	public String alterDatabase(String oldDatabaseName, String newDatabaseName){
		
		File toBeChanged = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+oldDatabaseName);
		File changed = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+newDatabaseName);
		
		if (toBeChanged.exists()) 
		{
			try
			{
				toBeChanged.renameTo(changed);
			} 
			catch(SecurityException se)
			{
			}
			actualDatabase = changed.getName();
			return "";
		}
		else
		{
			return "DATABASE " + toBeChanged.getName() + " DOES NOT EXISTS";
		}
	}
	
	
	/**
	 * Kill an existing database given database' name
	**/
	public String killDatabase(String databaseName){
		
		File toBeKilled = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+databaseName);

		if (toBeKilled.exists() && deleteDirectory(toBeKilled)) 
		{
			actualDatabase = "";
			return "";
		}
		else
		{
			return "DATABASE " + toBeKilled.getName() + " DOES NOT EXISTS";
		}
	}
	
	/**
	 * Recursive method to empty a directory 
	**/
	private boolean deleteDirectory(File directory) {
	    if(directory.exists())
	    {
	        File[] files = directory.listFiles();
	        if(null!=files)
	        {
	            for(int i=0; i<files.length; i++)
	            {
	                if(files[i].isDirectory()) 
	                {
	                    deleteDirectory(files[i]);
	                }
	                else 
	                {
	                    files[i].delete();
	                }
	            }
	        }
	    }
	    return(directory.delete());
	}
	
	/**
	 * USE an existing database given database' name
	**/
	public String useDatabase(String databaseName){
		
		File toBeUsed = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+databaseName);
		if (toBeUsed.exists())
		{
			actualDatabase = toBeUsed.getName();
			return "";
		}
		else
		{
			return "DATABASE " + toBeUsed.getName() + " DOES NOT EXISTS";
		}
	} 
	
	/**
	 * Show all existing databases  
	**/
	public String showDatabases(){
		String name ="Databases: \n";
		System.out.println("Actual Path for Databases is : " + System.getProperty("user.dir")+File.separator+"db"+File.separator);
		File[] files = new File(System.getProperty("user.dir")+File.separator+"db").listFiles();
		System.out.print(files[0].getName());
		int contador = 0;  
		for (File file : files) 
		{
			contador++;
			System.out.println(file.getName());
			if (file.isDirectory()) 
			{
				
				name = name+"\t["+contador+"] "+(file.getName()+"\n");
			}
		}
		return name;
	}
	
	/*
					CREATE TABLE
	*/
	
	
	/**
	 * Create table in existing database  
	**/
	public String createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes,ArrayList<KeyPFC> constraints){
		System.out.println(constraints);
		if (actualDatabase.equals("")){
			return "No Database in use";
		}
		else
		{
			
			File newTable = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt");
			File newTablemeta = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt");
			
		    try(BufferedWriter  output = new BufferedWriter(new FileWriter(newTablemeta)))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames)
		        {
		        	temp +=s+":"+colTypes.get(temp2)+",";
		        	temp2++;
		        }
		        output.write(temp.substring(0, temp.length()-1));
		        output.newLine();
		        output.write("R:0");
		        output.newLine();
		        output.write("PK");
		        output.newLine();
		        
		        temp = "";
		        for(KeyPFC k : constraints)
		        {
		        	if(k.type.equals("pk"))
		        	{
		        		temp+=k.id+",";
		        		for(String columna: k.columns_list_1)
		        		{
		        			temp+=columna+",";
		        		}
		        		output.write(temp.substring(0, temp.length()-1));
		        		output.newLine();
		        		temp = "";
		        	}
		        }
		        output.write("FK");
		        output.newLine();
		        temp="";
		        for(KeyPFC k : constraints)
		        {	
		        	if(k.type.equals("fk"))
		        	{
		        		File referencedTable = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+k.id_references+"Metadata.txt");
		        		if(!referencedTable.exists())
		        		{
		        			newTablemeta.delete();
		        			return "No Table Named "+k.id_references;
		        		}
		        		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+k.id_references+"Metadata.txt"), Charset.forName("UTF-8")));
		        		String[] typesAndColumns= br.readLine().split(",");
		        		int columnDoesNotExists = 0;
		        		
		        		for(String s:k.columns_list_2)
	        			{
		        			columnDoesNotExists = 0;
		        			for(int i=0; i<typesAndColumns.length;i++)
		        			{
		        				String[] name= typesAndColumns[i].split(":");
		        				if(s.equals(name))
		        				{
		        					System.out.println("Columna referenciada " + s + " = " + name );
		        					columnDoesNotExists = 0;
		        				}
		        				else
		        				{
		        					columnDoesNotExists+=1;
		        				}
		        			}
		        			if(columnDoesNotExists==(typesAndColumns.length-1))
		        			{
		        				br.close();
		        				newTablemeta.delete();
		        				return "Columna referenciada " + s + " No existe en tabla " + k.id_references;
		        			}
		        		}
		        		
		        		for(String s:k.columns_list_1)
	        			{
		        			columnDoesNotExists = 0;
		        			for(int i=0; i<colNames.size();i++)
		        			{
		        				if(s.equals(colNames.get(i)))
		        				{
		        					System.out.println("Columna referenciada " + s + " = " + colNames.get(i) );
		        					columnDoesNotExists = 0;
		        				}
		        				else
		        				{
		        					columnDoesNotExists+=1;
		        				}
		        			}
		        			if(columnDoesNotExists==(colNames.size()-1))
		        			{
		        				newTablemeta.delete();
		        				br.close();
		        				return "Columna referenciada " + s + " No existe en tabla a crear";
		        			}
		        		}
		        		
		        		temp+=k.id+",{,";
		        		for(String columna: k.columns_list_1)
		        		{
		        			temp+=columna+",";
		        		}
		        		temp+="},"+k.id_references+",{,";
		        		for(String columna: k.columns_list_2)
		        		{
		        			temp+=columna+",";
		        		}
		        		temp+="}";
		        		output.write(temp);
		        		output.newLine();
		        		temp = "";
		        	}
		        }
		        output.write("CHECK");
		        output.newLine();
		        temp = "";
		        for(KeyPFC k : constraints)
		        {
		        	if(k.type.equals("ch"))
		        	{
		        		temp+=k.exp;
		        		output.write(temp);
		        		output.newLine();
		        		temp = "";
		        	}
		        }
		        output.close();
		        try(BufferedWriter  output2 = new BufferedWriter(new FileWriter(newTable)))
			    {
		        	return "";
			    }
		        catch(IOException ex)
			    {
			        ex.printStackTrace();
			        return "Base de datos no existe";
			    }
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		        return "Base de datos no existe";
		    }
		}
	}
	
	
	/*
			ALTER TABLE
	*/
	
	/**
	 * rename table (on) in database in (on) use
	**/
	/**
	 * rename table (on) in database in (on) use
	**/
	public String  alterTableRename(String oldTableName, String newTableName){
		
		File toBeChanged = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+oldTableName+".txt");
		File changed = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+newTableName+".txt");
		
		File toBeChangedMeta = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+oldTableName+"Metadata.txt");
		File changedMeta = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+newTableName+"Metadata.txt");
		
		if (toBeChanged.exists()) 
		{
			try {
				toBeChanged.renameTo(changed);
			} catch(SecurityException se){
			
			}
			
			if(toBeChangedMeta.exists()){
				try{
					toBeChangedMeta.renameTo(changedMeta);
				} catch(SecurityException se){
					
				}
			}
			
			actualDatabase = changed.getName();
			return "";
		} else {
			return "Table " + toBeChanged.getName() + " does not exists";
		}
	}
	
	

	/**
	* Alter table appends a column.
	 * @throws IOException 
	**/
		public String  alterAddColumn(String tableName,String columnName, ArrayList<KeyPFC> constraints) throws IOException{
			
			String[] nombreytipo = columnName.split(",");
			
			File table = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt");
			File tableMetadata = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt");

			BufferedReader  reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));

			String[] columns  = reader.readLine().split(",");
			
			for(int i=0; i<columns.length;i++)
			{
				String[] data  = columns[i].split(":");
				
				if(data[1].equals(nombreytipo[0]))
				{
					return "Columna " + nombreytipo[0]+ " ya existe ";
				}
			}
			String linea = "";
			ArrayList<String> rows = new ArrayList<String>();
			
			BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
			while ((linea = file.readLine())!=null) 
			{
				rows.add((linea.substring(0, linea.length()-1))+ ",NULL;");
			}
			BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
			for(int i=0;i<rows.size();i++)
			{
				file2.write(rows.get(i));
				file2.newLine();
			}
			file2.close();
			
			rows = new ArrayList<String>();	
			file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
			boolean primerafila = true,primarykey = false,foreignkey=false,check=false;
			boolean newprimarykey =true, newforeingkey = true, newcheck = true;
			String temp="";
			while ((linea = file.readLine())!=null) 
			{
				if(primerafila)
				{
					rows.add((linea.substring(0, linea.length()-1))+ ","+columnName+";");
					primerafila=false;
				}
				else if(linea.contains("PK"))
				{
					primarykey=true;
					rows.add(linea);
				}
				else if(primarykey)
				{
					if(newprimarykey && !constraints.isEmpty())
					{
						for(KeyPFC k : constraints)
				        {
							if(k != null){
					        	if(k.type.equals("pk"))
					        	{
					        		temp+=k.id+",";
					        		for(String columna: k.columns_list_1)
					        		{
					        			temp+=columna+",";
					        		}
					        		rows.add(temp.substring(0, temp.length()-1));
					        		temp = "";
					        	}
							}
				        }
						newprimarykey=false;
					}
					rows.add(linea);
				}
				else if(linea.contains("FK"))
				{
					primarykey=false;
					foreignkey=true;
					rows.add(linea);
				}
				else if(foreignkey)
				{
					if(newforeingkey)
					{
					temp="";
			        for(KeyPFC k : constraints)
			        {	
			        	if(k.type.equals("fk"))
			        	{
			        		File referencedTable = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+k.id_references+"Metadata.txt");
			        		if(!referencedTable.exists())
			        		{
			        			return "No Table Named "+k.id_references;
			        		}
			        		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+k.id_references+"Metadata.txt"), Charset.forName("UTF-8")));
			        		String[] typesAndColumns= br.readLine().split(",");
			        		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"), Charset.forName("UTF-8")));
			        		String[] typesAndColumns2= br.readLine().split(",");
			        		int columnDoesNotExists = 0;
			        		
			        		for(String s:k.columns_list_2)
		        			{
			        			columnDoesNotExists = 0;
			        			for(int i=0; i<typesAndColumns.length;i++)
			        			{
			        				String[] name= typesAndColumns[i].split(":");
			        				if(s.equals(name))
			        				{
			        					System.out.println("Columna referenciada " + s + " = " + name );
			        					columnDoesNotExists = 0;
			        				}
			        				else
			        				{
			        					columnDoesNotExists+=1;
			        				}
			        			}
			        			if(columnDoesNotExists==(typesAndColumns.length-1))
			        			{
			        				br.close();
			        				return "Columna referenciada " + s + " No existe en tabla " + k.id_references;
			        			}
			        		}
			        		
			        		for(String s:k.columns_list_1)
		        			{
			        			columnDoesNotExists = 0;
			        			for(int i=0; i<typesAndColumns2.length;i++)
			        			{
			        				if(typesAndColumns2[i].contains(s))
			        				{
			        					System.out.println("Columna referenciada " + s + " = " + typesAndColumns2[i] );
			        					columnDoesNotExists = 0;
			        				}
			        				else
			        				{
			        					columnDoesNotExists+=1;
			        				}
			        			}
			        			if(columnDoesNotExists==(typesAndColumns2.length-1))
			        			{
			        				br.close();
			        				return "Columna referenciada " + s + " No existe en tabla";
			        			}
			        		}
			        		
			        		temp+=k.id+",{,";
			        		for(String columna: k.columns_list_1)
			        		{
			        			temp+=columna+",";
			        		}
			        		temp+="},"+k.id_references+",{,";
			        		for(String columna: k.columns_list_2)
			        		{
			        			temp+=columna+",";
			        		}
			        		temp+="}";
			        		rows.add(temp);	        		
			        		temp = "";
			        	}
			        }
			        newforeingkey=false;  
					}
					rows.add(linea);
				}
				else if(linea.contains("CH"))
				{
					foreignkey=false;
					check=true;
				}
				else if(check)
				{
					if(newcheck)
					{
					temp = "";
			        for(KeyPFC k : constraints)
			        {
			        	if(k.type.equals("ch"))
			        	{
			        		temp+=k.exp;
			        		rows.add(temp);
			        		temp = "";
			        	}
			        }
			        newcheck=false;
					}
					rows.add(linea);
				}
			}
			file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
			for(int i=0;i<rows.size();i++)
			{
				file2.write(rows.get(i));
				file2.newLine();
			}
			file2.close();
			
			
			return "";
		}
		
		
		public String  alterAddConstraint(String tableName, ArrayList<KeyPFC> constraints) throws IOException{
				
			
			return "";
		}
		
		public String  alterDropColumn(String tableName, String columnToDrop) throws IOException{
			
			BufferedReader  reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
	
			String line = reader.readLine();
			String[] columns  =line.substring(0, line.length()-1).split(",");
			int indiceDeColumna = 0;
			
			for(int i=0; i<columns.length;i++)
			{
				String[] data  = columns[i].split(":");
				
				if(data[1].equals(columnToDrop))
				{
					indiceDeColumna=i;
				}
			}
			
			ArrayList<String> rows = new ArrayList<String>();
			
			BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
			while ((line = file.readLine())!=null) 
			{
				line = line.substring(0,line.length()-1);
				String[] regs = line.split(",");
				line ="";
				for(int i=0; i<columns.length;i++)
				{
					if(!(i==indiceDeColumna))
					{
						line+=regs[i]+",";
					}
				}
				rows.add(line.substring(0,line.length()-1));
			}
			
			BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
			for(int i=0;i<rows.size();i++)
			{
				file2.write(rows.get(i));
				file2.newLine();
			}
			file2.close();
		
			return "";
		}
	
		public String  alterDropConstraint(String tableName, String constraintToDrop) throws IOException{
			
			ArrayList<String> rows = new ArrayList<String>();
			
			BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
			String line = "";
			while ((line = file.readLine())!=null) 
			{
				String[] regs = line.split(",");
				line ="";
				if(!regs[0].equals(constraintToDrop))
				{
					rows.add(line);
				}
			}
			
			BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
			for(int i=0;i<rows.size();i++)
			{
				file2.write(rows.get(i));
				file2.newLine();
			}
			file2.close();
		
		
		return "";
	}
	
	
	/**
	 * Kill an existing table on database in use
	**/
	public boolean killTable(String tableName)
	{
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		File toBeKilled = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt");

		if (toBeKilled.exists()) 
		{
			return true;
		}
		else{
			System.out.println("TABLE " + toBeKilled.getName() + " DOES NOT EXISTS");
			return false;
		}
	}
	
	/**
	 * Show all TABLES in actual database
	**/
	public void showTables()
	{
		if (actualDatabase.equals(""))
		{
			System.out.println("NO DATABASE IN USE");
		}
		else
		{
			Path currentRelativePath = Paths.get("");
			String s = currentRelativePath.toAbsolutePath().toString()+File.separator+actualDatabase;
			System.out.println("Actual Path for Database is : " + s);
			File[] files = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase).listFiles();
			
			for (File file : files) 
			{
				if (file.isFile()) 
				{
					System.out.println(file.getName().substring(0, file.getName().length()-4));
				}
			}
			
		}
		
	}
	
	/**
	 * Show COLUMNS and CONSTRAINS from TABLE
	 * @throws IOException 
	**/
	public void showColumns(String tableName) throws IOException{
		String dir = System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt";
		File table = new File(dir);
		if (actualDatabase.equals(""))
		{
			System.out.println("NO DATABASE IN USE");
		}
		else if(!table.isFile())
		{
			System.out.println("TABLE DOES NOT EXISTS");
		}
		else
		{
			BufferedReader br = new BufferedReader (new FileReader (dir));
			String line;

			while( (line = br.readLine() ) != null)
			{
			    System.out.println(line);
			}
			
		}
	}
}
