package application.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class DBmanagerDML {
	
	String actualDatabase = "controlPersonas";
	public DBmanagerDML() {
		
	}
	
	/**
	 * Insert INTO
	**/
	public void insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes) throws IOException
	{
		boolean error = false;
		BufferedReader br;
		InputStream fis = null;
		String archivoMetadata = System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt";
		fis = new FileInputStream(archivoMetadata);
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		br = new BufferedReader(isr);
	
		String[] columnsAndTypes= br.readLine().split(",");
		//delete the ; 
		columnsAndTypes[columnsAndTypes.length-1] = columnsAndTypes[columnsAndTypes.length-1].substring(0,columnsAndTypes[columnsAndTypes.length-1].length()-1 );  
	
		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] typeAndName = columnsAndTypes[i].split(":");
	
			for(int j=0;j<colNames.size();j++)
			{	
				if(colNames.get(j).equals(typeAndName[0]))
				{
					System.out.println(colNames.get(j) + " " + typeAndName[0] + colNames.get(j).equals(typeAndName[0]));
					
					if(typeAndName[1].contains("INT")){
						if(validateInt(colTypes.get(j))){
							System.out.println("Si es int");
						}
						else{
							System.out.println(colTypes.get(j)+" NO es int");
							error = true;
						}
					}
					else if(typeAndName[1].contains("CHAR")){
						if(validateCHAR(typeAndName[1],colTypes.get(j))){
							System.out.println("Si es char");
						}
						else{
							error = true;
						}
					}
					else if(typeAndName[1].contains("DATE")){
						if(validateDate(colTypes.get(j))){
							System.out.println("Si es date");
						}
						else{
							System.out.println(colTypes.get(j)+" NO es date");
							error = true;
						}
					}
					else if(typeAndName[1].contains("FLOAT")){
						if(validateFloat(colTypes.get(j))){
							System.out.println("Si es Float");
						}
						else{
							System.out.println(colTypes.get(j)+" NO es float");
							error = true;
						}
					}
					else{
						System.out.println("NULL!");
					}
				}
			}
			
		}
		if (error==false){
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
		        for(String s : colTypes){
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
	public boolean validateCHAR(String valor,String aInsertar){
		String tamano = valor.substring(5,valor.length()-1);
		if (aInsertar.length()<=Integer.parseInt(tamano))
		{
			return true;
		}
		else{
			System.out.println(aInsertar.length() + " ES MAYOR QUE " + tamano);
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
	
	/**
	 * Given filename convert file to arraylist of arraylist<string>
	 * @throws IOException 
	 */
	public ArrayList<ArrayList<String>> tableToArraylist(String tableName) throws IOException
	{
		BufferedReader reader = null;
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> registry = new ArrayList<String>();
		
		reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt")));

		String line;
		while ((line = reader.readLine()) != null) 
		{
			System.out.println(line);
			String[] columns = line.split(",");
			
			for(int i=0; i<columns.length;i++)
			{
				registry.add(columns[i]);
			}
			table.add(registry);
			registry = new ArrayList<String>();
		}	
		reader.close();
		return table;
	}
	
	
	/**
	 * Extract Types and Names
	 * @throws IOException 
	 */
	public ArrayList<ArrayList<String>> tableTypesAndNames(String tableName) throws IOException
	{
		BufferedReader reader = null;
		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> types = new ArrayList<String>();
		ArrayList<String> Names = new ArrayList<String>();
		
		reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));

		String[] columns  = reader.readLine().split(",");
	
		for(int i=0; i<columns.length;i++)
		{
			String[] data  = columns[i].split(":");
			types.add(data[0]);
			Names.add(data[1]);
		}
		table.add(types);
		table.add(Names);
		reader.close();
		return table;
	}
	
	
}