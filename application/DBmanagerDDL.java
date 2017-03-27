package application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class DBmanagerDDL {

	String actualDatabase = "";
	
	public DBmanagerDDL() {
		
	}
	
	/**
	 * Create Database given name
	 * If it exists already, notifies.
	**/
	public boolean createDatabase(String nameDatabase){
		File theDir = new File(nameDatabase);
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
			return true;
		}
		else{
			System.out.println("DATABASE " + theDir.getName() + " ALREADY EXISTS");
		}
		return false;
	}
	
	/**
	 * Rename given database
	**/
	public boolean alterDatabase(String oldDatabaseName, String newDatabaseName){
		
		File toBeChanged = new File(oldDatabaseName);
		File changed = new File(newDatabaseName);
		
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
			System.out.println("DATABASE " + toBeChanged.getName() + " DOES NOT EXISTS");
			return false;
		}
	}
	
	
	/**
	 * Kill an existing database given database' name
	**/
	public boolean killDatabase(String databaseName){
		
		File toBeKilled = new File(databaseName);

		if (toBeKilled.exists() && deleteDirectory(toBeKilled)) 
		{
			actualDatabase = "";
			return true;
		}
		else{
			System.out.println("DATABASE " + toBeKilled.getName() + " DOES NOT EXISTS");
			return false;
		}
	}
	
	/**
	 * Recursive method to empty a directory 
	**/
	private boolean deleteDirectory(File directory) {
	    if(directory.exists()){
	        File[] files = directory.listFiles();
	        if(null!=files){
	            for(int i=0; i<files.length; i++) {
	                if(files[i].isDirectory()) {
	                    deleteDirectory(files[i]);
	                }
	                else {
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
	public boolean useDatabase(String databaseName){
		
		File toBeUsed = new File(databaseName);
		if (toBeUsed.exists())
		{
			actualDatabase = toBeUsed.getName();
			return true;
		}
		else
		{
			System.out.println("DATABASE " + toBeUsed.getName() + " DOES NOT EXISTS");
			return false;
		}
	} 
	
	/**
	 * Show all existing databases  
	**/
	public void showDatabases(){
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Actual Path for Databases is : " + s);
		File[] files = new File(s).listFiles();
		
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
	public boolean createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		else{
			
			File newTable = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");
			
		    try(FileWriter fw=new FileWriter(newTable))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames){
		        	temp +=s+":"+colTypes.get(temp2)+",";
		        }
		        fw.write(temp.substring(0, temp.length()-1)+";");
		        fw.flush();
		        fw.close();
		        return true;
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		        return false;
		    }
		}
	}
	
	/**
	 * Create table in existing database WITH PRIMARY KEY 
	**/
	public boolean createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes,String pk,ArrayList<String> pkCols){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		else{
			
			File newTable = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");
			
		    try(FileWriter fw=new FileWriter(newTable))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames){
		        	temp +=s+":"+colTypes.get(temp2)+",";
		        }
		        fw.write(temp.substring(0, temp.length()-1)+";");
		        fw.flush();
		        fw.close();
		        return true;
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		        return false;
		    }
		}
	}
	
	/**
	 * Create table in existing database WITH PRIMARY KEY and FOREIGN KEY(s)
	**/
	public boolean createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes,String pkey,ArrayList<String> pkCols,ArrayList<String> fkeys, ArrayList<ArrayList<String>> fkeysReferences){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		else{
			
			File newTable = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");
			
		    try(FileWriter fw=new FileWriter(newTable))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames){
		        	temp +=s+":"+colTypes.get(temp2)+",";
		        }
		        fw.write(temp.substring(0, temp.length()-1)+";");
		        fw.flush();
		        fw.close();
		        return true;
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		        return false;
		    }
		}
	}
	
	/**
	 * Create table in existing database WITH PRIMARY KEY and FOREIGN KEY(s) and CHECK(s)
	**/
	public boolean createTable(String tableName, ArrayList<String> colNames, ArrayList<String> colTypes,String pkey,ArrayList<String> pkCols,ArrayList<String> fkeys, ArrayList<ArrayList<String>> fkeysReferences, ArrayList<String> checks ){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		else{
			
			File newTable = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");
			
		    try(FileWriter fw=new FileWriter(newTable))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames){
		        	temp +=s+":"+colTypes.get(temp2)+",";
		        }
		        fw.write(temp.substring(0, temp.length()-1)+";");
		        fw.flush();
		        fw.close();
		        return true;
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		        return false;
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
		
		File toBeChanged = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+oldTableName+".txt");
		File changed = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+newTableName+".txt");
		
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
	public boolean killTable(String tableName){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		File toBeKilled = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");

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
	public void showTables(){
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
		}
		else
		{
			Path currentRelativePath = Paths.get("");
			String s = currentRelativePath.toAbsolutePath().toString()+File.separator+actualDatabase;
			System.out.println("Actual Path for Database is : " + s);
			File[] files = new File(s).listFiles();
			
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
		if (actualDatabase.equals("")){
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

			while( (line = br.readLine() ) != null) {
			    System.out.println(line);
			}
			
		}
	}
	
	
}
