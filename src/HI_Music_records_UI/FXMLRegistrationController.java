/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HI_Music_records_UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class FXMLRegistrationController {
    
    @FXML
    private void ExitButtonAction(ActionEvent event){
        System.exit(0);
    }
    
    @FXML 
    private Button toSignIn;
    
    @FXML
    private void toSignInAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = (Stage) toSignIn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
