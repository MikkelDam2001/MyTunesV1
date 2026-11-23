package com.sea.mytunesv1.GUI;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BE.Song;

// Java FX imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class HelloController{
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
    public void handlePlayNext(ActionEvent actionEvent){}
    @FXML
    public void handlePlayLast(ActionEvent actionEvent){}
    @FXML
    public void handleStartPause(ActionEvent actionEvent){}
}

