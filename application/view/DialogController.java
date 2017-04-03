package application.view;

import application.main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DialogController {
	
	@FXML 
	private Label detailsLavel;
	
	
	private Stage dialogStage;
	private main mainApp;
	public boolean delete= false; 
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public void handleOK(){
		this.delete = true;
		dialogStage.close();
	}
	
	public void handleCancel(){
		this.delete = false;
		dialogStage.close();
		
	}
	
	public  void setMainApp(main app){
		this.mainApp = app;
		//outputArea.setWrapText(true);
		
	}
	
}
