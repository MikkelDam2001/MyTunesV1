package com.sea.mytunesv1.GUI;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class EditController {

    @FXML
    private TextField txtTitle, txtArtist, txtLength, txtFile;
    @FXML
    private ComboBox<String> cmbCategory;
    @FXML
    private Button btnSaveSongEdit, btnCancelSongEdit;
    private SongModel songModel;
    private Song selectedSong;
    private File selectedFile;

    public void setSongModel(SongModel songModel) {
        this.songModel = songModel;
    }

    public void setSelectedSong(Song selectedSong) {
        this.selectedSong = selectedSong;
    }

    public void initialize() {
        cmbCategory.getItems().addAll("Pop", "Rock", "Hip-Hop", "Jazz", "Classical", "Electronic", "Country", "R&B", "House");
    }

    @FXML
    public void handleSavePlaylistEdit(ActionEvent actionEvent) {
    }

    @FXML
    public void handleCancelPlaylistEdit(ActionEvent actionEvent) {
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }

    @FXML
    public void handleCancelEditSong(ActionEvent actionEvent) {
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }

    @FXML
    public void handleSaveSongEdit(ActionEvent actionEvent) throws Exception {

        if (selectedSong != null)
            selectedSong.setTitle(txtTitle.getText());
            selectedSong.setArtist(txtArtist.getText());
            selectedSong.setCategory(cmbCategory.getValue());
            selectedSong.setTime(txtLength.getLength());
            selectedSong.setFilepath(txtFile.getText());
        {
            songModel.editSong(selectedSong);
        }
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();

    }

    public void handleChooseFile(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        // Adds a file filter in file routing
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("MP3 files", "*.mp3"));
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("WAV files", "*.wav"));
        File file = chooser.showOpenDialog(txtFile.getScene().getWindow());
        if (file != null) {
            // sets file
            selectedFile = file;
            txtFile.setText(file.getName());
        }
    }
}
