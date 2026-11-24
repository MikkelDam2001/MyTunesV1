package com.sea.mytunesv1.GUI;

import com.sea.mytunesv1.BE.Song;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class NewSongController {

    @FXML
    private TextField txtTitleOfSong;
    @FXML
    private TextField txtNameOfArtist;
    @FXML
    private TextField txtTime;
    @FXML
    private TextField txtFilePath;
    @FXML
    private Button btnChooseFile;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnSave;

    // List of song genre from Song class
    @FXML
    private ComboBox<Song> cBoxGenre;

    public void handleSaveNewSong(ActionEvent actionEvent) {
    }

    public void handleCancelNewSong(ActionEvent actionEvent) {
    }

    public void handleFileChosen(ActionEvent actionEvent) {
    }

    public void handleChooseGenre(ActionEvent actionEvent) {
    }
}
