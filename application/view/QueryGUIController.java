package application.view;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.*;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

import application.model.DBMSLexer;
import application.model.DBMSParser;
import application.model.DBMSQueryVisitor;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import application.main;

public class QueryGUIController {
	
	@FXML 
	private TextArea queryLabel;
	
	@FXML
	private TreeView <String>treeView = new TreeView<String>();
	
	private main mainApp;
	
	
	public QueryGUIController(){
		
	}
	
	public void displayTreeView(String inputDirectoryLocation) {
	    // Creates the root item.
	    CheckBoxTreeItem<String> rootItem = new CheckBoxTreeItem<String>(inputDirectoryLocation);

	    // Hides the root item of the tree view.
	    treeView.setShowRoot(false);

	    // Creates the cell factory.
	    treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

	    // Get a list of files.
	    File fileInputDirectoryLocation = new File(inputDirectoryLocation);
	    File fileList[] = fileInputDirectoryLocation.listFiles();

	    // create tree
	    for (File file : fileList) {
	        createTree(file, rootItem);
	    }

	    treeView.setRoot(rootItem);
	}
	public static void createTree(File file, CheckBoxTreeItem<String> parent) {
	    if (file.isDirectory()) {
	        CheckBoxTreeItem<String> treeItem = new CheckBoxTreeItem<>(file.getName());
	        parent.getChildren().add(treeItem);
	        for (File f : file.listFiles()) {
	            createTree(f, treeItem);
	        }
	    } else if ("txt".equals(getFileExtension(file))) {
	        parent.getChildren().add(new CheckBoxTreeItem<>(file.getName()));
	    }
	}
	public static String getFileExtension(File file) {
	    String name = file.getName();
	    try {
	        return name.substring(name.lastIndexOf(".") + 1);
	    } catch (Exception e) {
	        return "";
	    }
	}
	
	/**
	 * Called whenever we click on the run button. 
	 * Specification has been set on Scene Builder. 
	 **/

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
		String fileLocation= (System.getProperty("user.dir"));
		//String fileLocation= ("C:\\Users\\Pablo\\Desktop\\UVG\\Base de Datos Tests");
		displayTreeView(fileLocation);
		//TreeItem<String> root = new TreeItem<>("Root");
		//treeView.setRoot(root);
	}
	
}
