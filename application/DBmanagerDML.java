package application;

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
	
	String actualDatabase = "";
	public DBmanagerDML() {
		
	}
	
	/**
	 * Insert INTO
	**/
	public boolean insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes) throws IOException
	{
		File table = new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt");
		
		if (actualDatabase.equals("")){
			System.out.println("NO DATABASE IN USE");
			return false;
		}
		else if(!table.isFile())
		{
			System.out.println("TABLE DOES NOT EXISTS");
			return false;
		}
		
		BufferedWriter  output = new BufferedWriter(new FileWriter(table,true));
		String temp = "";
		int no=0,rowsInMetadata=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"), Charset.forName("UTF-8")));
	
		String[] columnsAndTypes= br.readLine().split(",");
		
		while ((temp = br.readLine()) != null) {
			rowsInMetadata+=1;
		}
		System.out.println("CANTIDAD DE FILAS "+rowsInMetadata);
		br.close();
		temp = "";

		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] typeAndName = columnsAndTypes[i].split(":");
			no=0;
			for(int j=0;j<colNames.size();j++)
			{	
				if(colNames.get(j).equals(typeAndName[0]))
				{
					System.out.println(colNames.get(j) + " " + typeAndName[0] + colNames.get(j).equals(typeAndName[0]));
					System.out.println("Associado a " + typeAndName[1]);
					if(typeAndName[1].contains("INT")){
						if(validateInt(colTypes.get(j))){
							System.out.println("Si es int");
							temp +=colTypes.get(j)+",";
						}
						else{
							System.out.println(colTypes.get(j)+" NO es int");
							return false;
						}
					}
					else if(typeAndName[1].contains("CHAR")){
						if(validateCHAR(typeAndName[1],colTypes.get(j))){
							System.out.println("Si es char");
							temp +=colTypes.get(j)+",";
						}
						else{
							System.out.println(colTypes.get(j)+" NO es CHAR");
							return false;
						}
					}
					else if(typeAndName[1].contains("DATE")){
						if(validateDate(colTypes.get(j))){
							System.out.println("Si es date");
							temp +=colTypes.get(j)+",";
						}
						else{
							System.out.println(colTypes.get(j)+" NO es date");
							return false;
						}
					}
					else if(typeAndName[1].contains("FLOAT")){
						if(validateFloat(colTypes.get(j))){
							System.out.println("Si es Float");
							temp +=colTypes.get(j)+",";
						}
						else{
							System.out.println(colTypes.get(j)+" NO es float");
							return false;
						}
					}
				}
				else
				{
					if(no==colNames.size()-1)
					{
						System.out.println("NULL!");
						temp +="NULL"+",";
						no=0;
					}
					no+=1;
				}
			}
			
		}
		
		
		BufferedReader readTable = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+".txt")));
		String line;
		int regCount = 0;
		while ((line = readTable.readLine()) != null) 
		{
			regCount+=1;
		}
		System.out.println("TotalRegs " + regCount);
		
		if(regCount==0)
		{
			output.write(temp.substring(0, temp.length()-1)+";");
			output.close();
			br.close();
		}
		else
		{
			output.newLine();
			output.write(temp.substring(0, temp.length()-1)+";");
			output.close();
			br.close();
		}
		
		BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		while (file.readLine()!=null) 
		{
			
		}
		BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"),true));
		
		String input = "";
		int count = 0;

		while (count<=rowsInMetadata-1) {
		    if (count == 1) {
		    	file2.write("R:"+regCount);
		    	file2.newLine();
		    }
		    else{
		    	file2.write(file.readLine());
		    	file2.newLine();
		    }
		    count+=1;
		}
		
		file2.close();
		return true;
		
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
	
}

