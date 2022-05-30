

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HI_Music_records_UI;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class FXMLCreateController {
    
    @FXML 
    private AnchorPane navHome;
    
    @FXML
    private void toHomeAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
        Stage stage = (Stage) navHome.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML 
    private AnchorPane navMusic;
    
    @FXML
    private void toMusicAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMusic.fxml"));
        Stage stage = (Stage) navMusic.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}