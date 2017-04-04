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
	public void showDatabases(){
	
		System.out.println("Actual Path for Databases is : " + System.getProperty("user.dir")+File.separator+"db"+File.separator);
		File[] files = new File(System.getProperty("user.dir")+File.separator+"db").listFiles();
		
		for (File file : files) 
		{
			if (file.isDirectory()) 
			{
				System.out.println(file.getName());
			}
		}
	}
	
	/*
		 ▄████████    ▄████████    ▄████████    ▄████████     ███        ▄████████          ███        ▄████████ ▀█████████▄   ▄█          ▄████████ 
		███    ███   ███    ███   ███    ███   ███    ███ ▀█████████▄   ███    ███      ▀█████████▄   ███    ███   ███    ███ ███         ███    ███ 
		███    █▀    ███    ███   ███    █▀    ███    ███    ▀███▀▀██   ███    █▀          ▀███▀▀██   ███    ███   ███    ███ ███         ███    █▀  
		███         ▄███▄▄▄▄██▀  ▄███▄▄▄       ███    ███     ███   ▀  ▄███▄▄▄              ███   ▀   ███    ███  ▄███▄▄▄██▀  ███        ▄███▄▄▄     
		███        ▀▀███▀▀▀▀▀   ▀▀███▀▀▀     ▀███████████     ███     ▀▀███▀▀▀              ███     ▀███████████ ▀▀███▀▀▀██▄  ███       ▀▀███▀▀▀     
		███    █▄  ▀███████████   ███    █▄    ███    ███     ███       ███    █▄           ███       ███    ███   ███    ██▄ ███         ███    █▄  
		███    ███   ███    ███   ███    ███   ███    ███     ███       ███    ███          ███       ███    ███   ███    ███ ███▌    ▄   ███    ███ 
		████████▀    ███    ███   ██████████   ███    █▀     ▄████▀     ██████████         ▄████▀     ███    █▀  ▄█████████▀  █████▄▄██   ██████████ 
		             ███    ███                                                                                               ▀                      
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
	
	   ▄████████  ▄█           ███        ▄████████    ▄████████          ███        ▄████████ ▀█████████▄   ▄█          ▄████████ 
	   ███    ███ ███       ▀█████████▄   ███    ███   ███    ███      ▀█████████▄   ███    ███   ███    ███ ███         ███    ███ 
	   ███    ███ ███          ▀███▀▀██   ███    █▀    ███    ███         ▀███▀▀██   ███    ███   ███    ███ ███         ███    █▀  
	   ███    ███ ███           ███   ▀  ▄███▄▄▄      ▄███▄▄▄▄██▀          ███   ▀   ███    ███  ▄███▄▄▄██▀  ███        ▄███▄▄▄     
	 ▀███████████ ███           ███     ▀▀███▀▀▀     ▀▀███▀▀▀▀▀            ███     ▀███████████ ▀▀███▀▀▀██▄  ███       ▀▀███▀▀▀     
	   ███    ███ ███           ███       ███    █▄  ▀███████████          ███       ███    ███   ███    ██▄ ███         ███    █▄  
	   ███    ███ ███▌    ▄     ███       ███    ███   ███    ███          ███       ███    ███   ███    ███ ███▌    ▄   ███    ███ 
	   ███    █▀  █████▄▄██    ▄████▀     ██████████   ███    ███         ▄████▀     ███    █▀  ▄█████████▀  █████▄▄██   ██████████ 
	              ▀                                    ███    ███                                            ▀                      
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
