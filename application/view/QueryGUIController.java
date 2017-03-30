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
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Callback;
import application.main;

public class QueryGUIController {
	
	@FXML 
	private TextArea queryLabel;
	
	@FXML
	private TreeView <String>treeView = new TreeView<String>();
	
	@FXML
	private TableView<String> dataTable = new TableView<String>();
	
	private main mainApp;
	
	ObservableList<ObservableList<String>> csvData = FXCollections.observableArrayList();
	
	
	public QueryGUIController(){
		
	}
	
	public void displayTable(){
		dataTable.setTableMenuButtonVisible(true);
		dataTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
		ArrayList<TableColumn> columns = new ArrayList<TableColumn>();
		ArrayList<String> top = new ArrayList<String>();
		
		ArrayList<String> row = new ArrayList<String>();
		row.add("Pedro");
		row.add("Barre");
		row.add("UVG");
		
		 ObservableList<String> datap =
		        FXCollections.observableArrayList(
		          
		        );
		
		datap.add("Barreno");
		datap.add("14159");
		
		csvData.add(datap);
		top.add("First Name");
		top.add("Last Name");
		top.add("id");
		top.add("dir");
		top.add("dir2");
		top.add("dir3");
		System.out.println(top);
		
		for (int i = 0; i<top.size();i++){
			TableColumn<String,String> columna = new TableColumn<>(top.get(i));
			columna.setCellValueFactory(new Callback<CellDataFeatures<String, String>, ObservableValue<String>>() 
			{
                @Override
                public ObservableValue<String> call(CellDataFeatures<String, String> p) {
                    return new SimpleStringProperty((p.getValue()));
                }
             });
			//columna.setCellValueFactory(cellData -> new SimpleObjectProperty<String>("he"));
			columns.add(columna);
		}
		System.out.println(columns.get(1).getText());
		ObservableList<TableColumn> list = FXCollections.observableArrayList(columns);
		
		dataTable.getColumns().clear();
		dataTable.getColumns().add(columns.get(0));
		dataTable.getColumns().add(columns.get(1));
		dataTable.getColumns().add(columns.get(2));
		dataTable.getColumns().add(columns.get(3));
		dataTable.getColumns().add(columns.get(4));
		dataTable.getColumns().add(columns.get(5));
		
		dataTable.getItems().setAll(datap);
		
		
		
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
		displayTable();
	}
	
}
