package com.sea.mytunesv1.GUI;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.GUI.Model.SongModel;
import com.sea.mytunesv1.HelloApplication;
import com.sea.mytunesv1.GUI.Model.PlaylistModel;

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

// Java imports
import java.io.Serial;
import java.util.Objects;
import java.io.IOException;

public class MainController {

    @FXML
    private Label lblCurrentSong;

    @FXML
    private TableView<Playlist> tblPlaylists;
    @FXML
    public TableView<Song> tblAllSongs;
    @FXML
    private ListView lstSongsOnPlaylist;
    @FXML
    private Button btnPlayNext, btnPlayLast,btnStartPause;
    @FXML
    private Button btnNewPlaylist,btnEditPlaylist,btnDeletePlaylist;
    @FXML
    private Button btnMoveUp,btnMoveDown, btnDeleteSongOnPlaylist;
    @FXML
    private Button btnNewSong,btnEditSong,btnDeleteSong;
    @FXML
    public TableColumn colTitle, colArtist,colCategory, colTime;
    @FXML
    public TableColumn colPlName, colPlNumOfSongs,colPlTime;

    private SongModel songModel;
    private MusicController musicController = new MusicController();
    private PlaylistModel playlistModel;


    public MainController(){

        try {
            songModel = new SongModel();
            playlistModel = new PlaylistModel();
        } catch (Exception e) {
            displayError(e);
            e.printStackTrace();
        }

    }

    public void initialize()  {
        tblAllSongs.setItems(songModel.getSongsAvailable());
        tblPlaylists.setItems(playlistModel.getPlaylistsAvailable());

        tblAllSongs.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Song selected = tblAllSongs.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    System.out.println("Selected: ");
                    System.out.println(selected);
                    musicController.playSong(selected, lblCurrentSong);
                }
            }
        });

        // I initialize method
// setup columns i tableview til sange
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("time"));

        //setup colums i tableveiw til playlists
        colPlName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPlNumOfSongs.setCellValueFactory(new PropertyValueFactory<>("number of songs"));
        colPlTime.setCellValueFactory(new PropertyValueFactory<>("time"));
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
        // TJEK OP PÅ EVT SPAGHETTI KODE SENERE.
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("New/newplaylistdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Add New Playlist");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }
    @FXML
    public void handleEditPlaylist(ActionEvent actionEvent) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("Edit/editplaylistdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Playlist");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }
    @FXML
    public void handleDeletePlaylist(ActionEvent actionEvent) throws IOException {
        // TJEK OP PÅ EVT SPAGHETTI KODE SENERE.

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("Delete/deleteplaylistdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Delete Playlist");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();

    }
    @FXML
    public void handleMoveUp(ActionEvent actionEvent) {
    }
    @FXML
    public void handleMoveDown(ActionEvent actionEvent) {
    }
    @FXML
    public void handleDeleteSongOnPlaylist(ActionEvent actionEvent) throws IOException {
        // TJEK OP PÅ EVT SPAGHETTI KODE SENERE.

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("Delete/deletesongonplaylistdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Delete Song on Playlist");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }


    @FXML
    public void handleNewSong(ActionEvent actionEvent) throws IOException {
        // SETS NEW SONG STAGE.
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(HelloApplication.class.getResource("New/newsongdialog.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Add New Song");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)actionEvent.getSource()).getScene().getWindow() );
        stage.show();
    }

    @FXML
    public void handleEditSong(ActionEvent actionEvent) throws IOException {
        // TJEK LINJE 150 i MRS APPLIKATION, DER SKAL LAVES NY CLASS TIL TIL EDIT MÅSKE.
        Song selected = tblAllSongs.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("Edit/editsongdialog.fxml"));
        Parent root = loader.load();

        EditController editController = loader.getController();
        editController.setSongModel(songModel);
        editController.setSelectedSong(selected);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit song");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.showAndWait();

        tblAllSongs.refresh();
    }
    @FXML
    public void handleDeleteSong(ActionEvent actionEvent) throws IOException {
        // TJEK LINJE 174 I MRS APPLIKATION, CLASS ER OPRETTET TIL DELETE METODE.
        // TJEK OP PÅ EVT SPAGHETTI KODE SENERE.
        Song selected = tblAllSongs.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("Delete/deletesongdialog.fxml"));
        Parent root = loader.load();

        DeleteController deleteController = loader.getController();
        deleteController.setSongModel(songModel);
        deleteController.setSelectedSong(selected);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Delete Song");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
        stage.showAndWait();

        tblAllSongs.refresh();
    }


}

