/*package application.view;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

import application.model.DBMSLexer;
import application.model.DBMSParser;
import application.model.DBMSQueryVisitor;

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
	
	//Called whenever we click on the run button. 
	//Specification has been set on Scene Builder. 
	
	public void handleText(){
		String inputText = queryLabel.getText();
		System.out.println(inputText);
		ANTLRInputStream input = new ANTLRInputStream(inputText);
		DBMSLexer lexer = new DBMSLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		DBMSParser parser = new DBMSParser(tokens);
		ParseTree tree = parser.sql();
		DBMSQueryVisitor qVisitor = new DBMSQueryVisitor();
		qVisitor.visit(tree);
	}
	
	public  void setMainApp(main app){
		this.mainApp = app;
	}
	
}*/
