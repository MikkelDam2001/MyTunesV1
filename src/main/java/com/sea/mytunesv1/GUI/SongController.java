package com.sea.mytunesv1.GUI;

// Java FX imports
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

// Java imports
import java.io.File;
import java.io.FileReader;
import java.util.Locale;

public class SongController {

    @FXML
    private TextField txtTitle,txtArtist, txtLength, txtFile;
    @FXML
    private ComboBox<String> cmbCategory;
    @FXML
    private Button btnSaveSongEdit, btnCancelSongEdit;

    private SongModel songModel;

    private File selectedFile;




    @FXML
    public void initialize(){
        cmbCategory.getItems().addAll("Pop", "Rock", "Hip-Hop", "Jazz", "Classical", "Electronic", "Country");
        try {
            this.songModel = new SongModel();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    // Handles the chosen file
    @FXML
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

    @FXML
    private void handleChooseCategory(ActionEvent actionEvent) {

    }

    @FXML
    private void handleCancelNewSong(ActionEvent actionEvent) {
    }

    @FXML
    private void handleSaveNewSong(ActionEvent actionEvent) {
        // get user song data from UI
        String title = txtTitle.getText();
        String artist = txtArtist.getText();
        String genre = cmbCategory.getValue();
        if (genre == null){
            return;
        }
        int time = txtLength.getLength();
        String filepath = txtFile.getText();

        Song newSong = new Song(-1, title, artist, genre, time, filepath);

        try {
            songModel.createSong(newSong);
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();


        }catch (Exception err){
            displayError(err);

        }

    }
    private void displayError(Throwable t) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Something went wrong");
        alert.setHeaderText(t.getMessage());
        alert.showAndWait();
    }

    @FXML
    public void handleCancelEditSong(ActionEvent actionEvent) {
    }
    @FXML
    public void handleSaveSongEdit(ActionEvent actionEvent) {
    }
}
