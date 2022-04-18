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
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField username;
    
    @FXML
    private PasswordField password;
    
    @FXML
    private void SignInButtonAction(ActionEvent event) {
        System.out.println("Username is: "+username.getText());
        System.out.println("Password is: "+password.getText());
    }
    
    @FXML
    private void ExitButtonAction(ActionEvent event){
        System.exit(0);
    }
    
    @FXML 
    private Button signUpButton;
    
    @FXML
    private void SignUpAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRegistration.fxml"));
        Stage stage = (Stage) signUpButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @FXML 
    private Button toSignIn;
    
    @FXML
    private void toSignInAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = (Stage) toSignIn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @FXML 
    private Button toRetrivePassword;
    
    @FXML
    private void toRetrivePasswordAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLForgotPassword.fxml"));
        Stage stage = (Stage) toRetrivePassword.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
