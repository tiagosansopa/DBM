package application.model;
import java.util.ArrayList;

import application.model.DBMSParser.ExpContext;

public class KeyPFC {
	/*Realmente pienso que es una estupidez que sean privados,
	 *  asi que hay full acceso. No voy a hacer esos estupidos metodos*/
	public String type;
	public String id;
	public ArrayList<String> columns_list_1;
	public ArrayList<String> columns_list_2;
	public String id_references;
	public String exp;
	
	public KeyPFC(){
		columns_list_1 = new ArrayList<String>();
		columns_list_2 = new ArrayList<String>();
	}
}
