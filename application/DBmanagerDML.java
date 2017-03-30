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
	**/
	public void insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes) throws IOException
	{
		BufferedReader br;
		InputStream fis = null;
		String archivoMetadata = System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt";
		fis = new FileInputStream(archivoMetadata);
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		br = new BufferedReader(isr);
		
		String[] columnsAndTypes= br.readLine().split(",");
		columnsAndTypes[columnsAndTypes.length()-1]=columnsAndTypes[columnsAndTypes.length()-1].substring(0, );  
		String actual = "";
				
		for(int i=0; i<=colTypes.size();i++)
		{
			actual = colNames.get(i);
			for(int j=0;j<=columnsAndTypes.length;i++)
			{
				
			}
			
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
	
	/*
	 * Validate if given value is an integer
	 */
	public boolean validateInt(String valor)
	{
		try 
		{
		      int numberToInsert = Integer.parseInt(valor);
		      return true;
		} 
		catch (NumberFormatException e) 
		{
			System.out.println(actualDatabase + " is not an Integer");
			return false;
		}
	}
	
	/*
	 * Validate if given string' length is equal or less than specified
	 */
	public boolean validateCHAR(String tipo, String valor){
		String tamano=valor.substring(5,valor.length()-1);
		if (valor.length()<=Integer.parseInt(tamano))
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	/*
	 * Validate if given date is valid
	 */
	public boolean validateDate(String date){
		String[] dateSplit = date.split("-");
		
		if(dateSplit[1].equals("02")&&dateSplit[2].equals("30")){
			return false;
		}
		if(dateSplit[1].equals("02")&&dateSplit[2].equals("31")){
			return false;
		}
		if (dateSplit[0].length()!=4||dateSplit[1].length()!=2||dateSplit[2].length()!=2)
		{
			return false;
		}
		if (Integer.parseInt(dateSplit[1])<1 || Integer.parseInt(dateSplit[1])>12)
		{
			return false;
		}
		if (Integer.parseInt(dateSplit[2])<1 || Integer.parseInt(dateSplit[2])>31)
		{
			return false;
		}
		if (Integer.parseInt(dateSplit[0])<1000 || Integer.parseInt(dateSplit[0])>3000)
		{
			return false;
		}
		else{
			return true;
		}
	}
	
	/*
	 * Validate float from given string
	 */
	public boolean validateFloat(String valor)
	{
		try 
		{
			Float f = new Float("20.75f");
		    float numberToFloat = f.parseFloat(valor);
		    return true;
		} 
		catch (NumberFormatException e) 
		{
			System.out.println(actualDatabase + " is not an Float");
			return false;
		}
	}
	
}

