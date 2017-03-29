package application.model;
import java.util.ArrayList;

public class KeyPFC {
	/*Realmente pienso que es una estupidez que sean privados,
	 *  asi que hay full acceso. No voy a hacer esos estupidos metodos*/
	public String type;
	public String id;
	public ArrayList<String> columns_list_1;
	public ArrayList<String> columns_list_2;
	public String id_references;
	
	public KeyPFC(String id, String type){
		this.id = id;
		this.type = type;
		columns_list_1 = new ArrayList<String>();
		columns_list_2 = new ArrayList<String>();
	}
}
