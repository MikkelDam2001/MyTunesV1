package com.sea.mytunesv1.GUI;

// Java FX imports
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class DeleteController {
    @FXML
    public Label lblYesNo;
    @FXML
    private Button btnPLDeleteFinal, btnPLCancelFinal, btnSongDeleteFinal, btnSongCancelFinal;

    private SongModel songModel;
    private Song selectedSong;

    public void setSongModel(SongModel songModel) {
        this.songModel = songModel;
    }
    public void setSelectedSong(Song selectedSong) {
        this.selectedSong = selectedSong;
    }

    @FXML
    public void handlePLDeleteFinal(ActionEvent actionEvent) {
    }

    @FXML
    public void handlePLCancelFinal(ActionEvent actionEvent) {
    }

    //Her vil vi slette sangen fra allsongs listen.
    @FXML
    public void handleSongDeleteFinal(ActionEvent actionEvent) throws Exception {

        if (selectedSong != null) {
            songModel.deleteSong(selectedSong);
        }
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }

    @FXML
    public void handleSongCancelFinal(ActionEvent actionEvent) {
    }

    @FXML
    public void handleSongOnPLDeleteFinal(ActionEvent actionEvent) {
    }

    @FXML
    public void handleSongOnPLCancelFinal(ActionEvent actionEvent) {
    }
}
