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

public class NewSongController {

    @FXML
    private TextField txtTitle,txtArtist, txtLength, txtFile;
    @FXML
    private ComboBox<String> cmbCategory;

    private File selectedFile;

    // Handles the chosen file
    @FXML
    public void handleChooseFile(ActionEvent actionEvent) {

        FileChooser chooser = new FileChooser();
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("MP3 files", "*mp3"));
        File file = chooser.showOpenDialog(txtFile.getScene().getWindow());
        if (file != null) {
            // sets file
            selectedFile = file;
            txtFile.setText(file.getName());
        }
    }


    public void handleChooseCategory(ActionEvent actionEvent) {
    }
}
