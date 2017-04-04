package application.view;

import application.main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DialogController {
	
	@FXML 
	private Label detailsLabel;
	
	
	private Stage dialogStage;
	private main mainApp;
	private String detailsForLabel;
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
	public void setDetailsForLabel(String details){
		this.detailsForLabel = details;
		detailsLabel.setText(details);
	}
	
	public  void setMainApp(main app){
		this.mainApp = app;
		//outputArea.setWrapText(true);
		
	}
	
}
