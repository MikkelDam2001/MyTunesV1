package com.sea.mytunesv1.GUI.Model;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.BLL.Song.SongManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class SongModel {

    private ObservableList <Song> songsAvailable;
    private SongManager songManager;

    public SongModel() throws Exception {
        songManager = new SongManager();
        songsAvailable = FXCollections.observableArrayList();
        songsAvailable.addAll(songManager.getAllSongs());
    }



    public ObservableList<Song> getSongsAvailable() {
        return songsAvailable;
    }

    public void searchsongs(String query) throws Exception {
        List<Song> searchResults = songManager.searchSongs(query);
        songsAvailable.clear();
        songsAvailable.addAll(searchResults);
    }


}
