package com.sea.mytunesv1.GUI;

// Java FX imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

// Java imports
import java.io.File;
import java.util.Locale;

public class SongController {

    @FXML
    private TextField txtTitle,txtArtist, txtLength, txtFile;
    @FXML
    private ComboBox<Locale.Category> cmbCategory;
    @FXML
    private Button btnSaveSongEdit, btnCancelSongEdit;

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
    @FXML
    public void handleCancelEditSong(ActionEvent actionEvent) {
    }
    @FXML
    public void handleSaveSongEdit(ActionEvent actionEvent) {
    }
}
