/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HI_Music_records_UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class HI_Music_records_UI extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        //stage.initStyle(StageStyle.UTILITY);
        
        stage.setTitle("HI Music Management System");
        Image image = new Image("HI_Music_records_UI/images/HI Music - black.png");
        stage.getIcons().add(image);
        
        stage.setMaxWidth(1062);
        stage.setMaxHeight(626);
        
        stage.setMinWidth(1062);
        stage.setMinHeight(626);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
