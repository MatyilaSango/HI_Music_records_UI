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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class FXMLHomeController {
    
    @FXML 
    private AnchorPane navMusic;
    
    @FXML
    private void toMusicAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMusic.fxml"));
        Stage stage = (Stage) navMusic.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @FXML
    private Label latestSongNameLabel;
    
    @FXML
    private void viewLatestMusic() throws IOException{
        DataAccess da = new DataAccess();
        List<SoundcloudLinks> links = da.findAll();
        SoundcloudLinks latestLink = links.get(0);
        String latestCode = latestLink.getCode();
        String[] tmplist = latestCode.split(">");
        String songName = tmplist[tmplist.length-2].replaceAll("</a", "");
        latestSongNameLabel.setText(songName);
    }
}
