package application.view;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import application.main;

public class QueryGUIController {
	
	@FXML 
	private TextArea queryLabel;
	
	private main mainApp;
	
	public QueryGUIController(){
		
	}
	
	/**
	 * Called whenever we click on the run button. 
	 * Specification has been set on Scene Builder. 
	 **/
	public void handleText(){
		String input = queryLabel.getText();
		System.out.println(input);
	}
	
	public  void setMainApp(main app){
		this.mainApp = app;
	}
	
}
