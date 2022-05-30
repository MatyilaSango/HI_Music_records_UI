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
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Sango
 */
public class FXMLMusicController {
    
    @FXML 
    private AnchorPane navCreate;
    
    @FXML
    private void toCreateAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLCreate.fxml"));
        Stage stage = (Stage) navCreate.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML 
    private AnchorPane navHome;
    
    @FXML
    private void toHomeAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
        Stage stage = (Stage) navHome.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    private class data{
        SimpleStringProperty name, code;
        
        private data(String name, String code){
            this.name = new SimpleStringProperty(name);
            this.code = new SimpleStringProperty(code);
        }

        private String getName() {
            return name.get();
        }

        private String getCode() {
            return code.get();
        }
    }
    
    @FXML
    private TableView songTable;
    @FXML
    private TableColumn titlesCol;
    @FXML
    private TableColumn embedsCol;
    
    
    @FXML
    private void viewLatestMusic() throws IOException{
        DataAccess da = new DataAccess();
        List<SoundcloudLinks> links = da.findAll();
        
        titlesCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        embedsCol.setCellValueFactory(new PropertyValueFactory<>("code"));

        ObservableList<data> obl = FXCollections.observableArrayList();
        for(int i=0; i<links.size(); i++){
            SoundcloudLinks Link = links.get(i);
            String Code = Link.getCode();
            String[] tmplist = Code.split(">");
            String songName = tmplist[tmplist.length-2].replaceAll("</a", "");
            obl.add(new data(songName, Code));
            System.out.println(Link);
        }
        
        songTable.setItems(obl);
        songTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }
}
