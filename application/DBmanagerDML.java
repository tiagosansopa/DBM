package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class DBmanagerDML {
	
	String actualDatabase = "";
	
	public DBmanagerDML() {
		
	}
	
	/**
	 * Insert INTO
	**/
	public void insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes)
	{
		String dir = System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt";
		File table = new File(dir);
		
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
		}
		else if(!table.isFile())
		{
			System.out.println("TABLE DOES NOT EXISTS");
		}
		else{
			try(BufferedWriter  output = new BufferedWriter(new FileWriter(table,true)))
		    {
		    	String temp = "";
		    	int temp2 = 0;
		        for(String s : colNames){
		        	temp +=s+",";
		        	System.out.println(temp2 + s);
		        	temp2++;
		        }
		        output.newLine();
		        output.write(temp.substring(0, temp.length()-1)+";");
		        output.close();
		    }
		    catch(IOException ex)
		    {
		        ex.printStackTrace();
		    }
		}
		
	}
	
	/**
	 * UPDATE
	**/
	public void update(){
		
	}

	/**
	 * DELETE
	**/
	public void delete(){

	}
	
	/**
	 * SELECT
	**/
	public void select(){
		
	}

	public void setActualDatabase(String actualDatabase) {
		this.actualDatabase = actualDatabase;
	}
	
	
}

