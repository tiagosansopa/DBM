package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class DBmanagerDML {
	
	String actualDatabase = "";
	public DBmanagerDML() {
		
	}
	
	/**
	 * Insert INTO
	 * @throws IOException 
	**/
	public void insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes) throws IOException
	{
		String archivoMetadata = System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt";
		String[] columnsAndTypes;
		String actual = "";
		BufferedReader br;
		InputStream fis = null;
		fis = new FileInputStream(archivoMetadata);
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		br = new BufferedReader(isr);
		
		columnsAndTypes = br.readLine().split(",");
		
		for(int i=0; i<=colTypes.size();i++)
		{
			actual = colNames.get(i);
			for(int j=0;j<=columnsAndTypes.length();)
			
		}
		
		
		
		
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
		
		br.close();
		
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

