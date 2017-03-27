package application;

import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class UIMmain {

    public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String query = "",temp = "",temp2 = "";
		int cantidad = 0;
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> tipos = new ArrayList<String>();
		
		DBmanagerDDL ddl = new DBmanagerDDL();
		DBmanagerDML dml = new DBmanagerDML();
		
		while(!query.equals("salir"))
		{
			System.out.println("Ingresar Query");
			query = scan.next();
			switch (query) 
			{
				case "CREATE":
				{
					System.out.println("CREATE DATABASE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					
					if(ddl.createDatabase(temp)){
						System.out.println(temp + " Creado");
					}
				}
				break;
				
				case "ALTER":
				{
					System.out.println("ALTER DATABASE");
					System.out.println("Ingrese nombre original");
					temp = scan.next();
					System.out.println("Ingrese nombre nuevo");
					temp2 = scan.next();
					
					if(ddl.alterDatabase(temp, temp2)){
						System.out.println(temp + " Renombrado a " + temp2); 
					}
				}
				break;
				
				case "DROP":
				{
					System.out.println("DROP DATABASE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					
					if(ddl.killDatabase(temp)){
						System.out.println(temp + " Eliminado");
					} 
				}
				break;
				
				case "USE":
				{
					System.out.println("USE DATABASE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					
					if(ddl.useDatabase(temp)){
						System.out.println(temp + " en Uso");
					}
					
				}
				break;
				
				case "SHOW":
				{
					System.out.println("SHOW DATABASE");
					ddl.showDatabases();
				}
				break;
				
				case "CREATE_TABLE":
				{
					System.out.println("CREATE TABLE");
					System.out.println("Nombre? ");
					temp = scan.next();
					System.out.println("Cuantas columnas va a ingresar? ");
					cantidad = scan.nextInt();
					while(cantidad>0)
					{ 
						System.out.println("Ingrese nombre de columna: ");
						nombres.add(scan.next());
						System.out.println("Ingrese tipo de dato de columna: ");
						tipos.add(scan.next());
						cantidad--;
					} 
					
					if(ddl.createTable(temp, nombres, tipos)){
						System.out.println(temp + " creada");
					}
					
				}
				break;
				
				case "ALTER_TABLE_RENAME":
				{
					System.out.println("ALTER TABLE RENAME");
					System.out.println("antiguo nombre? ");
					temp = scan.next();
					System.out.println("nuevo nombre? ");
					temp2 = scan.next();
					
					if(ddl.alterTableRename(temp, temp2)){
						System.out.println(temp + " TABLA Renombrada a " + temp2); 
					}
				}
				break;
				
				case "DROP_TABLE":
				{
					System.out.println("DROP TABLE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					
					if(ddl.killTable(temp)){
						System.out.println(temp + " Eliminado");
					} 
				}
				break;
				
				case "SHOW_TABLES":
				{
					System.out.println("SHOW TABLES");
					ddl.showTables();
				}
				break;
				
				case "SHOW_COLUMNS_FROM":
				{
					System.out.println("SHOW COLUMNS FROM");
					System.out.println("cual tabla?");
					temp = scan.next();
					try {
						ddl.showColumns(temp);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
				
				case "INSERT":
				{
					System.out.println("INSERT INTO");
					System.out.println("Insert en cual tabla? ");
					temp = scan.next();
					System.out.println("Cuantas columnas va a ingresar? ");
					cantidad = scan.nextInt();
					while(cantidad>0)
					{ 
						System.out.println("Ingrese nombre de columna: ");
						nombres.add(scan.next());
						System.out.println("Ingrese valor: ");
						tipos.add(scan.next());
						cantidad--;
					} 
					
					dml.setActualDatabase(ddl.getActualDatabase());
					dml.insertInto(temp, nombres, tipos);
				}
				break;
				
				case "UPDATE":
				{
					System.out.println("UPDATE");
		
				}
				break;
				
				case "DELETE":
				{
					System.out.println("DELETE");
		
				}
				break;
				
				case "SELECT":
				{
					System.out.println("SELECT");
		
				}
				break;
				
			}
		}
		scan.close();
    }
}

