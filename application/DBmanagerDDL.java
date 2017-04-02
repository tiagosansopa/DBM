package application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

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
	public String createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes){
		if (actualDatabase.equals("")){
			return "NO DATABASE IN USE";
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
		        output.write("FK");
		        output.newLine();
		        output.write("CHECK");
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
	public boolean alterTableRename(String oldTableName, String newTableName){
		
		File toBeChanged = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+oldTableName+".txt");
		File changed = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+newTableName+".txt");
		
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
			return true;
		}
		else{
			System.out.println("TABLE " + toBeChanged.getName() + " DOES NOT EXISTS");
			return false;
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
