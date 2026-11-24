package com.sea.mytunesv1.GUI.Model;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.BLL.Song.SongManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class SongModel {

    private ObservableList <Song> SongsAvailable;
    private SongManager songManager;

    public SongModel() throws Exception {
        songManager = new SongManager();
        SongsAvailable = FXCollections.observableArrayList();
        SongsAvailable.addAll(songManager.getAllSongs());
    }



    public ObservableList<Song> getObservableMovies() {
        return SongsAvailable;
    }

    public void searchsongs(String query) throws Exception {
        List<Song> searchResults = songManager.searchSongs(query);
        SongsAvailable.clear();
        SongsAvailable.addAll(searchResults);
    }


}
