package com.sea.mytunesv1.GUI;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import com.sea.mytunesv1.HelloApplication;
// Java FX imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


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
    @FXML
    public TableColumn colTitle;
    @FXML
    public TableColumn colArtist;
    @FXML
    public TableColumn colCategory;
    @FXML
    public TableColumn colTime;

    private SongModel songModel;


    public MainController(){

        try {
            songModel = new SongModel();
        } catch (Exception e) {
            displayError(e);
            e.printStackTrace();
        }

    }


    public void initialize()  {
        tblAllSongs.setItems(songModel.getSongsAvailable());

        // I initialize method
// setup columns in tableview
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("time"));
       // txtSongSearch.textProperty().addListener((observableValue, oldValue, newValue) -> {
       //     try {
         //       songModel.searchSong(newValue);
         //   } catch (Exception e) {
           //     displayError(e);
             //   e.printStackTrace();
            //}
        // });

}
        private void displayError(Throwable t) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Something went wrong");
            alert.setHeaderText(t.getMessage());
            alert.showAndWait();
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

