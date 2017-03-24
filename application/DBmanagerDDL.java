package application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File; 

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
	
	
}
