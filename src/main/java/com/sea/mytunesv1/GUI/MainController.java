package com.sea.mytunesv1.GUI;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.HelloApplication;
// Java FX imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;


public class MainController {
    @FXML
    private TableView<Playlist> tblPlaylists;
    @FXML
    private TableView<Song> tblAllSongs;
    @FXML
    private ListView lstSongsOnPlaylist;
    @FXML
    private Button btnPlayNext;
    @FXML
    private Button btnPlayLast;
    @FXML
    private Button btnStartPause;
    @FXML
    private Button btnNewPlaylist;
    @FXML
    private Button btnEditPlaylist;
    @FXML
    private Button btnDeletePlaylist;
    @FXML
    private Button btnMoveUp;
    @FXML
    private Button btnMoveDown;
    @FXML
    private Button btnDeleteSongOnPlaylist;
    @FXML
    private Button btnNewSong;
    @FXML
    private Button btnEditSong;
    @FXML
    private Button btnDeleteSong;

    public MainController(){

    }
    @FXML
    public void handlePlayNext(ActionEvent actionEvent){
    }
    @FXML
    public void handlePlayPrevious(ActionEvent actionEvent){
    }
    @FXML
    public void handlePlayPause(ActionEvent actionEvent){
    }
    @FXML
    public void handleNewPlaylist(ActionEvent actionEvent) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("newplaylistdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Add New Playlist");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();

    }
    @FXML
    public void handleEditPlaylist(ActionEvent actionEvent) {
    }
    @FXML
    public void handleDeletePlaylist(ActionEvent actionEvent) {
    }
    @FXML
    public void handleMoveUp(ActionEvent actionEvent) {
    }
    @FXML
    public void handleMoveDown(ActionEvent actionEvent) {
    }
    @FXML
    public void handleDeleteSongOnPlaylist(ActionEvent actionEvent) {
    }

    @FXML
    public void handleNewSong(ActionEvent actionEvent) throws IOException {
        // SETS NEW SONG STAGE.
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("newsongdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Add New Song");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }

    @FXML
    public void handleEditSong(ActionEvent actionEvent) {
    }
    @FXML
    public void handleDeleteSong(ActionEvent actionEvent) {
    }
}

