

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HI_Music_records_UI;

import DAO.DataAccess;
import Entities.SoundcloudLinks;
import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
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
    
    @FXML
    private Text statusText;
    @FXML
    private TextArea textAreaCode;
    @FXML
    private void saveCode() throws IOException {
        String code = textAreaCode.getText();
        DataAccess dao = new DataAccess();
        List<SoundcloudLinks> codes = dao.findAll();
        boolean condition = false;
        for(SoundcloudLinks cod : codes){
            if(cod.getCode().equals(code)){
                condition = true;
                statusText.setStyle("-fx-fill: red;");
                statusText.setText("Code already exist!");
            }
        }
        if(condition == false){
            dao.persist(code);
            statusText.setStyle("-fx-fill: green;");
            statusText.setText("Successfuly saved!");
        }
        
    }
}
