package com.sea.mytunesv1.GUI;

import com.sea.mytunesv1.BE.Song;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Locale;

public class NewSongController {

    @FXML
    private TextField txtTitle,txtArtist, txtLength, txtFile;
    @FXML
    private ComboBox<Locale.Category> cmbCategory;

    private File selectedFile;

    // Handles the chosen file
    @FXML
    public void handleChooseFile(ActionEvent actionEvent) {

        FileChooser chooser = new FileChooser();

        // Adds a file filter in file routing
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("MP3 files", "*mp3"));
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("WAV files", "*wav"));
        File file = chooser.showOpenDialog(txtFile.getScene().getWindow());
        if (file != null) {
            // sets file
            selectedFile = file;
            txtFile.setText(file.getName());
        }
    }

    @FXML
    private void handleChooseCategory(ActionEvent actionEvent) {

    }

    @FXML
    private void handleCancelNewSong(ActionEvent actionEvent) {
    }

    @FXML
    private void handleSaveNewSong(ActionEvent actionEvent) {
        // get user song data from UI
    }
}
