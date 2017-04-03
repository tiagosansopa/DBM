package application;

import java.io.IOException;

import application.view.DialogController;
import application.view.QueryGUIController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("DBMS");

        initRootLayout();

        showQueryGUI();
    }

    
    /// Initializes the root layout.
     
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(main.class.getResource("view/rootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    /// Shows queryGUI inside the root layout.
     
    public void showQueryGUI() {
        try {
            // Load query overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(main.class.getResource("view/queryGUI.fxml"));
            AnchorPane queryGUI = (AnchorPane) loader.load();
            
            
            // Set query overview into the center of root layout.
            rootLayout.setCenter(queryGUI);
            
            // Linking the root layout 
            QueryGUIController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean showPersonEditDialog(String details) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(main.class.getResource("view/alertDeleteDatabase.fxml"));
            GridPane page = (GridPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller.
            DialogController controller = loader.getController();
            controller.setDetailsForLabel(details);
            controller.setDialogStage(dialogStage);
            //controller.setPerson(person);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.delete;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    /// Returns the main stage.
    /// @return
     
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}