package com.sea.mytunesv1.GUI;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BE.Song;

// Java FX imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController {
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

    public HelloController(){

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
}

