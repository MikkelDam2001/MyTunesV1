package com.sea.mytunesv1.GUI;

// Java FX imports
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;

public class DeleteController {
    public Label lblYesNo;
    @FXML
    private Button btnPLDeleteFinal, btnPLCancelFinal, btnSongDeleteFinal, btnSongCancelFinal;

    @FXML
    private TableView<Song> tblAllSongs;

    private SongModel songModel;


    @FXML
    public void handlePLDeleteFinal(ActionEvent actionEvent) {
    }
    @FXML
    public void handlePLCancelFinal(ActionEvent actionEvent) {
    }

    //Her vil vi slette sangen fra allsongs listen.
    @FXML
    public void handleSongDeleteFinal(ActionEvent actionEvent) throws Exception {
        Song selectedSong = tblAllSongs.getSelectionModel().getSelectedItem();

        if (selectedSong != null)
        {
            // Delete movie in DAL layer (through the layers)
            songModel.deleteSong(selectedSong);
            tblAllSongs.refresh();
        }
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
