package application.view;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


import org.antlr.v4.runtime.*;

import application.model.DBMSLexer;
import application.model.DBMSParser;
import application.model.DBMSQueryVisitor;
import application.model.DBmanagerDDL;
import application.model.DBmanagerDML;
import application.model.ThrowingErrorListener;
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
	private TextField currentDatabase;
	
	@FXML 
	private TextArea outputArea;
	
	@FXML
	private TreeView <String>treeView = new TreeView<String>();
	
	@FXML
	private TableView<ObservableList<String>> dataTable = new TableView<ObservableList<String>>();
	
	private main mainApp;
	
	private ObservableList<ObservableList<String>> csvData = FXCollections.observableArrayList();
	
	private DBmanagerDDL ddl;
	private DBmanagerDML dml;
	private List<String> errors;
	private Path path = Paths.get(System.getProperty("user.dir").replace("application.view", "application.model")+File.separator+"ErrorLog_Syntax.log");
	private String details="";
	String fileLocation= (System.getProperty("user.dir")+File.separator+"db");
	
	public QueryGUIController(){
		ddl = new DBmanagerDDL();
		dml = new DBmanagerDML();
	}
	public void displayTable(ArrayList<ArrayList<String>> rows){
		csvData.clear();
		ArrayList<String> columnNames = rows.get(0);
		rows.remove(0);
		rows.remove(0);
		ArrayList<TableColumn> columns = new ArrayList<TableColumn>();
		for (int i = 0;i<rows.size();i++){
			ArrayList<String> row = rows.get(i);
			csvData.add(FXCollections.observableArrayList(row));
		}
		for (int i = 0; i<columnNames.size();i++){
			final int index = i;
			//System.out.println(index);
			TableColumn<ObservableList<String>,String> columna = new TableColumn<>(columnNames.get(i));
			
			columna.setCellValueFactory(new Callback<CellDataFeatures<ObservableList<String>, String>, ObservableValue<String>>() 
			{
                @Override
                public ObservableValue<String> call(CellDataFeatures<ObservableList<String>, String> p) {
                    return new SimpleStringProperty((p.getValue().get(index)));
                }
             });
			//System.out.println(index);
			//columna.setCellValueFactory(cellData -> new SimpleObjectProperty<String>("he"));
			columns.add(columna);
		
		}
		dataTable.getColumns().clear();
		for (int j = 0;j<columns.size();j++){
			dataTable.getColumns().add(columns.get(j));
		}
		dataTable.getItems().setAll(csvData);
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
		BaseErrorListener miErrorListener = new ThrowingErrorListener();
		ANTLRInputStream input = new ANTLRInputStream(inputText);
		DBMSLexer lexer = new DBMSLexer(input);
		lexer.removeErrorListeners();
        lexer.addErrorListener(miErrorListener);
		
        TokenStream tokens = new CommonTokenStream(lexer);
		DBMSParser parser = new DBMSParser(tokens);
		parser.removeErrorListeners();
        parser.addErrorListener(miErrorListener);
		ParseTree tree = parser.sql();
		try {
            outputArea.setText("");

            errors = Files.readAllLines(path, Charset.forName("UTF-8"));

            Files.deleteIfExists(path);

            System.out.println(errors);

            for (int i = 0; i < errors.size(); i++) {
                outputArea.appendText("(" + (i + 1) + "): " + errors.get(i) + "\n");
            }
        } catch ( IOException e ) {
            outputArea.setText(" No Syntactic Errors \n ");
            DBMSQueryVisitor qVisitor = new DBMSQueryVisitor(ddl, dml);
            qVisitor.setController(this);
            ArrayList<ArrayList<String>> table = qVisitor.visit(tree);
            outputArea.appendText(qVisitor.errors.toString());
    		displayTreeView(fileLocation);
    		currentDatabase.setText(ddl.getActualDatabase());
    		if(table != null){
    			displayTable(table);
    		}
        }
	}
	
	public boolean handleDelete(){
		boolean delete = this.mainApp.showPersonEditDialog(this.details);
		return delete;
	}
	public void setDetails(String details){
		this.details = details;
	}
	
	public  void setMainApp(main app){
		this.mainApp = app;
		outputArea.setWrapText(true);
		displayTreeView(fileLocation);
		currentDatabase.setText(ddl.getActualDatabase());
		
	}
	
}
