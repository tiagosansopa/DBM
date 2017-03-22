/*import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;
import java.io.File; 

public class UIMmain {

    public static void main(String[] args) 
	{
		String query = "", actualDatabase = "", temp = "";
		Scanner scan = new Scanner(System.in);
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
					File theDir = new File(temp);
					if (!theDir.exists()) 
					{
						System.out.println("creating directory: " + theDir.getName());
						boolean result = false;

						try
						{
							theDir.mkdir();
							result = true;
						} 
						catch(SecurityException se)
						{
						}        
						if(result) 
						{    
							System.out.println(temp + " Creado");  
						}
					}
				}
				break;
				
				case "ALTER":
				{
					System.out.println("ALTER DATABASE");
					System.out.println("Ingrese nombre original");
					temp = scan.next();
					File toBeChanged = new File(temp);
					System.out.println("Ingrese nombre nuevo");
					temp = scan.next();
					File changed = new File(temp);
					toBeChanged.renameTo(changed);
					System.out.println(temp + " Renombrado"); 
				}
				break;
				
				case "DROP":
				{
					System.out.println("DROP DATABASE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					File tempFile = new File(temp);
					deleteDirectory(tempFile);
					System.out.println(temp + " Eliminado");
				}
				break;
				
				case "USE":
				{
					System.out.println("USE DATABASE");
					System.out.println("Ingrese nombre");
					temp = scan.next();
					actualDatabase = temp;
					System.out.println(actualDatabase + " en Uso");
					
				}
				break;
				
				case "SHOW":
				{
					System.out.println("SHOW DATABASE");
					Path currentRelativePath = Paths.get("");
					String s = currentRelativePath.toAbsolutePath().toString();
					System.out.println("Current relative path is: " + s);
					File[] files = new File(s).listFiles();
					
					for (File file : files) 
					{
						if (file.isDirectory()) 
						{
							System.out.println(file.getName());
						}
					}
				}
				break;
			}
		}
    }
	
	public static boolean deleteDirectory(File directory) {
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

}
*/
