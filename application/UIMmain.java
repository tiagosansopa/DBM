package application;

import java.util.*;

public class UIMmain {

    public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String query = "",temp = "",temp2 = "";
		
		DBmanagerDDL ddl = new DBmanagerDDL();
		
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
				
				case "CREATE TABLE":
				{
					System.out.println("CREATE TABLE");
				}
				break;
				
				case "ALTER TABLE":
				{
					System.out.println("ALTER TABLE");
				}
				break;
				
				case "DROP TABLE":
				{
					System.out.println("DROP TABLE");
				}
				break;
				
				case "SHOW TABLES":
				{
					System.out.println("SHOW TABLES");
				}
				break;
				
				case "SHOW TABLES FROM":
				{
					System.out.println("SHOW TABLES FROM");
				}
				break;
			}
		}
		scan.close();
    }
}

