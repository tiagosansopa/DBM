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
import java.util.Arrays;

public class DBmanagerDML {
	
	String actualDatabase = "";
	
	public DBmanagerDML() {
		
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
	 * Insert INTO
	**/
	public String insertInto(String tableName,ArrayList<String> colNames, ArrayList<String> colTypes) throws IOException {
		File table = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt");
		/*
		 * 
		 * Reviso que la tabla exista o que si tengamos una base de datos en uso
		 * 
		 */
		if (actualDatabase.equals("")){
			return "No Database in Use";
		}
		else if(!table.isFile())
		{
			return "Table "+ tableName +  " no existe en " + actualDatabase;
		}
		
		/*
		 * 
		 * Reviso las columnas en las que voy a insertar. Valido el tipo de dato. Valido si viene vacio
		 * y agrego un NULL. 
		 * 
		 */
		
		BufferedWriter  output = new BufferedWriter(new FileWriter(table,true));
		String newRegistry = "";
		int no=0,rowsInMetadata=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"), Charset.forName("UTF-8")));
	
		String[] columnsAndTypes= br.readLine().split(",");
		
		while ((newRegistry = br.readLine()) != null) {
			rowsInMetadata+=1;
		}

		br.close();
		newRegistry = "";

		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] typeAndName = columnsAndTypes[i].split(":");
			no=0;
			for(int j=0;j<colNames.size();j++)
			{	
				System.out.println(colNames.get(j) + " = " + colNames.get(j).equals(typeAndName[0]));
				if(colNames.get(j).equals(typeAndName[0]))
				{
					System.out.println(colNames.get(j) + " " + typeAndName[0] + colNames.get(j).equals(typeAndName[0]));
					System.out.println("Associado a " + typeAndName[1]);
					if(typeAndName[1].toUpperCase().contains("INT")){
						if(validateInt(colTypes.get(j))){
							newRegistry +=colTypes.get(j)+",";
						}
						else{
							return colTypes.get(j)+" NO cumple correcto INT";
						}
					}
					else if(typeAndName[1].toUpperCase().contains("CHAR")){
						if(validateCHAR(typeAndName[1],colTypes.get(j).substring(1, colTypes.get(j).length()-1))){
							newRegistry +=colTypes.get(j).substring(1, colTypes.get(j).length()-1)+",";
						}
						else{
							return colTypes.get(j).substring(1, colTypes.get(j).length()-1)+" CHAR es mas largo que el valor especificado";
						}
					}
					else if(typeAndName[1].toUpperCase().contains("DATE")){
						if(validateDate(colTypes.get(j))){
							newRegistry +=colTypes.get(j)+",";
						}
						else{
							return colTypes.get(j)+" NO cumple correcto DATE";
						}
					}
					else if(typeAndName[1].toUpperCase().contains("FLOAT")){
						if(validateFloat(colTypes.get(j))){
							newRegistry +=colTypes.get(j)+",";
						}
						else{
							return colTypes.get(j)+" NO cumple correcto FLOAT";
						}
					}
				}
				else
				{
					if(no==colNames.size()-1)
					{
						newRegistry +="NULL"+",";
						no=0;
					}
					no+=1;
				}
			}
			
		}
		System.out.println(newRegistry);
		
		/*
		 * 
		 * Guardar los Constraints
		 * 
		 */
		ArrayList<String> PK = new ArrayList<String>();
		ArrayList<String> FK = new ArrayList<String>();
		ArrayList<ArrayList<String>> FKs = new ArrayList<ArrayList<String>>();
		ArrayList<String> CH = new ArrayList<String>();
		
		BufferedReader readMetadata = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		String constraints ="";
		while (!constraints.contains("PK")) 
		{
			constraints = readMetadata.readLine();
		}
		PK.addAll(Arrays.asList(readMetadata.readLine().split(",")));
		while (!constraints.contains("CH")) 
		{
			constraints = readMetadata.readLine();
			if(!constraints.contains("CH")&&!constraints.contains("FK"))
			{
				FK.addAll(Arrays.asList(constraints.split(",")));
				FKs.add(FK);
				FK = new ArrayList<String>();
			}
		}
		readMetadata.close();
		
		/*
		 * 
		 * Reviso que PRIMARY KEY no se repita en ningun registro
		 * 
		 */
		
		ArrayList<Integer> pkColumns = new ArrayList<Integer>();
		ArrayList<String> pkValues = new ArrayList<String>();
		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] nameAndType = columnsAndTypes[i].split(":");
			for(int s=1;s<PK.size();s++)
			{
				if(nameAndType[0].equals(PK.get(s)))
				{
					String[] newRegSplit = newRegistry.split(",");
					pkValues.add(newRegSplit[i]);
					pkColumns.add(i);
				}
			}
		}
		
		System.out.println("PK "+pkValues+" EN COLUMNA " + pkColumns );
		
		ArrayList<ArrayList<String>> tableToInsert = new ArrayList<ArrayList<String>>();
		ArrayList<String> rows = new ArrayList<String>();
		int repeated = 0;
		BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));

		String line;
		while ((line = reader.readLine()) != null) 
		{
			System.out.println(line.substring(0, line.length()-1));
			String[] columns = line.substring(0, line.length()-1).split(",");
			
			for(int i=0; i<columns.length;i++)
			{
				rows.add(columns[i]);
			}
			tableToInsert.add(rows);
			rows = new ArrayList<String>();
		}	
		reader.close();
		
		for(ArrayList<String> n : tableToInsert)
		{
			for(int c = 0; c<pkColumns.size();c++)
			{
				//System.out.println("Es igual " + n.get(pkColumns.get(c)) + " = " + pkValues.get(c));
				if(n.get(pkColumns.get(c)).equals(pkValues.get(c)))
				{
					//System.out.println("Primary key " + n.get(pkColumns.get(c)) + " = " + pkValues.get(c) + " Se repitio");
					repeated+=1;
				}
			}
			if(repeated==pkColumns.size())
			{
				//System.out.println("Primary key en registro " + n + " Se repitio");
				return "Primary key ya existe en el registro " + n ;
			}
			else{
				repeated=0;	
			}
		}
		
		/*
		 * 
		 * Reviso que FOREING KEY exista  (ya sea la referencia o el registro)
		 * 
		 */
		/*
		
		int cont=0;
		for(ArrayList<String> fkActual:FKs)
		{
			for(int i=2;i<fkActual.size();i++)
			{
				while(!fkActual.get(i).equals("}"))
				{
					for(int j=0; i<columnsAndTypes.length;i++)
					{
						String[] typeAndName = columnsAndTypes[i].split(":");
						if(!typeAndName[0].equals(fkActual.get(i)))
						{
							
						}
					}
					
				}
			}
		}
		
		ArrayList<String> colLocales = new ArrayList<String>();
		ArrayList<String> colExternas = new ArrayList<String>();
		
		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] nameAndType = columnsAndTypes[i].split(":");
			for(int s=1;s<FK.size();s++)
			{
				if(nameAndType[0].equals(PK.get(s)))
				{
					String[] newRegSplit = newRegistry.split(",");
					pkValues.add(newRegSplit[i]);
					pkColumns.add(i);
				}
			}
		}
		
		System.out.println("FK "+pkValues+" EN COLUMNA " + pkColumns );
		*/
		
		
		/*
		 * 
		 * Reviso CHECKS
		 * 
		 */
		
		
		
		
		
		/*
		 * 
		 * Cuento cantidad de registros actuales y escribo el nuevo registro
		 * 
		 */
		
	
		BufferedReader readTable = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
		int regCount = 0;
		line="";
		while ((line = readTable.readLine()) != null) 
		{
			regCount+=1;
		}
		System.out.println("TotalRegs " + regCount);
		System.out.println("newRegistry es "+ newRegistry+ " este");
		
		if(regCount==0)
		{
			output.write(newRegistry.substring(0, newRegistry.length()-1)+";");
			output.close();
			br.close();
		}
		else
		{
			output.newLine();
			output.write(newRegistry.substring(0, newRegistry.length()-1)+";");
			output.close();
			br.close();
		}
		
		/*
		 * 
		 * Sobreescribo en archivo de metadata con nueva cantidad de regs 
		 * 
		 */
		
		rows = new ArrayList<String>();
		
		BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		while ((newRegistry = file.readLine())!=null) 
		{
			if(newRegistry.contains("R:"))
			{
				rows.add("R:"+(regCount+1));
			}
			else{
				rows.add(newRegistry);
			}
		}
		BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		for(int i=0;i<rows.size();i++)
		{
			file2.write(rows.get(i));
			file2.newLine();
		}
		file2.close();
		output.close();

		return "";
		
	}
	
	/**
	 * Insert INTO sin columNames. Se agregan los values en el orden predeterminado
	**/
	public String insertInto(String tableName, ArrayList<String> colValues) throws IOException
	{
		File table = new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt");
		/*
		 * 
		 * Reviso que la tabla exista o que si tengamos una base de datos en uso
		 * 
		 */
		if (actualDatabase.equals("")){
			return "No Database in Use";
		} else if(!table.isFile()) {
			return "Table "+ tableName +  " no existe en " + actualDatabase;
		}
		
		/*
		 * 
		 * Reviso las columnas en las que voy a insertar. Valido el tipo de dato. Valido si viene vacio
		 * y agrego un NULL. 
		 * 
		 */
		
		BufferedWriter  output = new BufferedWriter(new FileWriter(table,true));
		String newRegistry = "";
		int no=0,rowsInMetadata=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"), Charset.forName("UTF-8")));
	
		String[] columnsAndTypes= br.readLine().split(",");
		
		while ((newRegistry = br.readLine()) != null) {
			rowsInMetadata+=1;
		}

		br.close();
		newRegistry = "";

		for(int i=0; i<columnsAndTypes.length;i++){
			String[] typeAndName = columnsAndTypes[i].split(":");
			no=0;
			System.out.println(colValues.get(i) + " " + typeAndName[0] + " " + typeAndName[1]);
			if(typeAndName[1].toUpperCase().contains("INT")){
				if(validateInt(colValues.get(i))){
					newRegistry +=colValues.get(i)+",";
				} else {
					return colValues.get(i)+" NO cumple correcto INT";
				}
			} else if(typeAndName[1].toUpperCase().contains("CHAR")){
				if(validateCHAR(typeAndName[1],colValues.get(i).substring(1, colValues.get(i).length()-1))){
					newRegistry +=colValues.get(i).substring(1, colValues.get(i).length()-1)+",";
				} else {
					return colValues.get(i).substring(1, colValues.get(i).length()-1)+" CHAR es mas largo que el valor especificado";
				}
			} else if(typeAndName[1].toUpperCase().contains("DATE")){
				if(validateDate(colValues.get(i))){
					newRegistry +=colValues.get(i)+",";
				} else {
					return colValues.get(i)+" NO cumple correcto DATE";
				}
			} else if(typeAndName[1].toUpperCase().contains("FLOAT")){
				if(validateFloat(colValues.get(i))){
					newRegistry +=colValues.get(i)+",";
				} else {
					return colValues.get(i)+" NO cumple correcto FLOAT";
				}
			}
		}	
	
		if(columnsAndTypes.length!=colValues.size())
		{	
			int resta = 0;
			while(resta!=(columnsAndTypes.length-colValues.size()))
			{
				newRegistry +="NULL"+",";
				resta+=1;
			}
		}
		
		System.out.println(newRegistry);
		
		/*
		 * 
		 * Guardar los Constraints
		 * 
		 */
		ArrayList<String> PK = new ArrayList<String>();
		ArrayList<String> FK = new ArrayList<String>();
		ArrayList<ArrayList<String>> FKs = new ArrayList<ArrayList<String>>();
		ArrayList<String> CH = new ArrayList<String>();
		
		BufferedReader readMetadata = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		String constraints ="";
		while (!constraints.contains("PK")) 
		{
			constraints = readMetadata.readLine();
		}
		PK.addAll(Arrays.asList(readMetadata.readLine().split(",")));
		while (!constraints.contains("CH")) 
		{
			constraints = readMetadata.readLine();
			if(!constraints.contains("CH")&&!constraints.contains("FK"))
			{
				FK.addAll(Arrays.asList(constraints.split(",")));
				FKs.add(FK);
				FK = new ArrayList<String>();
			}
		}
		readMetadata.close();
		
		/*
		 * 
		 * Reviso que PRIMARY KEY no se repita en ningun registro
		 * 
		 */
		
		ArrayList<Integer> pkColumns = new ArrayList<Integer>();
		ArrayList<String> pkValues = new ArrayList<String>();
		for(int i=0; i<columnsAndTypes.length;i++)
		{
			String[] nameAndType = columnsAndTypes[i].split(":");
			for(int s=1;s<PK.size();s++)
			{
				if(nameAndType[0].equals(PK.get(s)))
				{
					String[] newRegSplit = newRegistry.split(",");
					pkValues.add(newRegSplit[i]);
					pkColumns.add(i);
				}
			}
		}
		
		System.out.println("PK "+pkValues+" EN COLUMNA " + pkColumns );
		
		ArrayList<ArrayList<String>> tableToInsert = new ArrayList<ArrayList<String>>();
		ArrayList<String> rows = new ArrayList<String>();
		int repeated = 0;
		BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));

		String line;
		while ((line = reader.readLine()) != null) 
		{
			System.out.println(line.substring(0, line.length()-1));
			String[] columns = line.substring(0, line.length()-1).split(",");
			
			for(int i=0; i<columns.length;i++)
			{
				rows.add(columns[i]);
			}
			tableToInsert.add(rows);
			rows = new ArrayList<String>();
		}	
		reader.close();
		
		for(ArrayList<String> n : tableToInsert)
		{
			for(int c = 0; c<pkColumns.size();c++)
			{
				//System.out.println("Es igual " + n.get(pkColumns.get(c)) + " = " + pkValues.get(c));
				if(n.get(pkColumns.get(c)).equals(pkValues.get(c)))
				{
					//System.out.println("Primary key " + n.get(pkColumns.get(c)) + " = " + pkValues.get(c) + " Se repitio");
					repeated+=1;
				}
			}
			if(repeated==pkColumns.size())
			{
				//System.out.println("Primary key en registro " + n + " Se repitio");
				return "Primary key ya existe en el registro " + n ;
			}
			else{
				repeated=0;	
			}
		}
		
		/*
		 * 
		 * Reviso que FOREING KEY exista  (el registro)
		 * 
		 */

		ArrayList<String> fklocalColumnNames = new ArrayList<String>();
		ArrayList<String> fkrefColumnNames = new ArrayList<String>();
		ArrayList<Integer> fklocalColumnNumber = new ArrayList<Integer>();
		ArrayList<Integer> fkrefColumnNumber = new ArrayList<Integer>();
		ArrayList<String> fklocalColumnValue = new ArrayList<String>();
		
		int indexkey = 0;
		String tablerefname = "";
		
		for(ArrayList<String> key : FKs)
		{
			//Obtengo las columnas del constraint escrito en el archivo
			for(int i=2;i<key.size();i++)
			{
				if(!key.get(i).equals("}"))
				{
					fklocalColumnNames.add(key.get(i));
				}
				else if(key.get(i).equals("}"))
				{
					indexkey=i;
					break;
				}
			}
			tablerefname=key.get(indexkey+1);
			for(int i=(indexkey+2);i<key.size();i++)
			{
				if(!key.get(i).equals("}"))
				{
					fkrefColumnNames.add(key.get(i));
				}
				else if(key.get(i).equals("}"))
				{
					break;
				}
			}
			
			System.out.println("Columnas locales "+fklocalColumnNames+ " referencian "+ fkrefColumnNames + " en tabla "+ tablerefname);
			
			//buscar los indices a los que corresponden
			
			BufferedReader tablaLocal = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt"), Charset.forName("UTF-8")));
			BufferedReader tablaRef = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tablerefname+"Metadata.txt"), Charset.forName("UTF-8")));
			
			String[] nombreytipo1= tablaLocal.readLine().split(",");
			String[] nombreytipo2= tablaRef.readLine().split(",");
			
			for(int i=0; i<nombreytipo1.length;i++)
			{
				String[] nameAndType = nombreytipo1[i].split(":");
				for(int s=1;s<fklocalColumnNames.size();s++)
				{
					if(nameAndType[0].equals(fklocalColumnNames.get(s)))
					{
						fklocalColumnNumber.add(s);
					}
				}
			}
			
			for(int i=0; i<nombreytipo2.length;i++)
			{
				String[] nameAndType = nombreytipo2[i].split(":");
				for(int s=1;s<fkrefColumnNames.size();s++)
				{
					if(nameAndType[0].equals(fkrefColumnNames.get(s)))
					{
						fkrefColumnNumber.add(s);
					}
				}
			}
			String[] newRegSplit = newRegistry.split(",");
			
			for(Integer n :fklocalColumnNumber)
			{
				fklocalColumnValue.add(newRegSplit[n]);
			}
			
			//Cargo la tabla completa a revisar
			
			ArrayList<ArrayList<String>> refArrayTable = new ArrayList<ArrayList<String>>();
			ArrayList<String> refRegistry = new ArrayList<String>();
			
			BufferedReader refTable = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tablerefname+".txt")));

			while ((line = refTable.readLine()) != null) 
			{
				System.out.println(line);
				line = line.substring(0, line.length()-1);
				System.out.println(line);
				String[] columns = line.split(",");
				
				for(int i=0; i<columns.length;i++)
				{
					refRegistry.add(columns[i]);
				}
				refArrayTable.add(refRegistry);
				refRegistry = new ArrayList<String>();
			}	
		
			//Ahora por cada registro reviso si se repite. Si se repite me salgo y digo donde se repitio. Si no continuo
			boolean siexiste = false;
			int numFK = 0;
			for(ArrayList<String> registro:refArrayTable)
			{
				for(Integer n:fkrefColumnNumber)
				{
					if(registro.get(n).equals(fklocalColumnValue.get(numFK)))
					{
						System.out.println("FK local con valor "+fklocalColumnValue.get(numFK)+ " existe = " +registro.get(n));
						siexiste=true;
					}
					numFK+=1;
				}
			}
			
			if(siexiste==false)
			{
				return "FK "+ key + " no existe referencia en tabla contenedora";
			}
			
		}
		
		/*
		 * 
		 * Reviso CHECKS
		 * 
		 */
		
		
		
		
		
		/*
		 * 
		 * Cuento cantidad de registros actuales y escribo el nuevo registro
		 * 
		 */
		
	
		BufferedReader readTable = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));
		int regCount = 0;
		line="";
		while ((line = readTable.readLine()) != null) 
		{
			regCount+=1;
		}
		System.out.println("TotalRegs " + regCount);
		System.out.println("newRegistry es "+ newRegistry+ " este");
		
		if(regCount==0)
		{
			output.write(newRegistry.substring(0, newRegistry.length()-1)+";");
			output.close();
			br.close();
		}
		else
		{
			output.newLine();
			output.write(newRegistry.substring(0, newRegistry.length()-1)+";");
			output.close();
			br.close();
		}
		
		/*
		 * 
		 * Sobreescribo en archivo de metadata con nueva cantidad de regs 
		 * 
		 */
		
		rows = new ArrayList<String>();
		
		BufferedReader file = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		while ((newRegistry = file.readLine())!=null) 
		{
			if(newRegistry.contains("R:"))
			{
				rows.add("R:"+(regCount+1));
			}
			else{
				rows.add(newRegistry);
			}
		}
		BufferedWriter  file2 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));
		for(int i=0;i<rows.size();i++)
		{
			file2.write(rows.get(i));
			file2.newLine();
		}
		file2.close();
		output.close();

		return "";
		
	
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
		if(dateSplit.length == 3){
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
		return false;
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
		
		reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+".txt")));

		String line;
		int index = 0;
		while ((line = reader.readLine()) != null) 
		{
			System.out.println(line);
			line = index+","+line.substring(0, line.length()-1);
			System.out.println(line);
			String[] columns = line.split(",");
			
			for(int i=0; i<columns.length;i++)
			{
				registry.add(columns[i]);
			}
			table.add(registry);
			registry = new ArrayList<String>();
			index+=1;
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
		
		reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+File.separator+"db"+File.separator+actualDatabase+File.separator+tableName+"Metadata.txt")));

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