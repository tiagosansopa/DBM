package application.model;
import java.util.ArrayList;

import application.model.DBMSParser.ExpContext;

public class KeyPFC {
	/*Realmente pienso que es una estupidez que sean privados,
	 *  asi que hay full acceso. No voy a hacer esos estupidos metodos*/
	public String type; //primary key:pk fk, ch 
	public String id;   //nombre del consraint antes del type
	public ArrayList<String> columns_list_1; // pk viene la columna que es primary key, fk la columnda fk 
	public ArrayList<String> columns_list_2; // si pk nada, si fk viene las columnas a las que referencia 
	public String id_references; // la tabla que referencia foreign key 
	public String exp; // si es un check viene la expression completa 
	
	public KeyPFC(){
		columns_list_1 = new ArrayList<String>();
		columns_list_2 = new ArrayList<String>();
	}
}
