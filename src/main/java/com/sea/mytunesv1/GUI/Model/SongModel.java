package com.sea.mytunesv1.GUI.Model;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.BLL.Song.SongManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.List;

public class SongModel {

    private FilteredList <Song> filteredList;

    private ObservableList <Song> songsAvailable;

    private SongManager songManager;

    public SongModel() throws Exception {
        songManager = new SongManager();
        songsAvailable = FXCollections.observableArrayList();
        songsAvailable.addAll(songManager.getAllSongs());
        filteredList = new FilteredList<>(songsAvailable);
    }

    public void createSong(Song newSong) throws Exception {
        Song createdSong = songManager.createSong(newSong);
        songsAvailable.add(createdSong);
    }

    public ObservableList<Song> getSongsAvailable() {
        return songsAvailable;
    }

    public void searchSongs(String query) throws Exception {
        List<Song> searchResults = songManager.searchSongs(query);
        songsAvailable.clear();
        songsAvailable.addAll(searchResults);
    }

    public void deleteSong(Song selectedSong) throws Exception {
        //delete song in DAL layer (through the layers)
        songManager.deleteSong(selectedSong);

        //remove from observable list (and UI)
        songsAvailable.remove(selectedSong);
    }

    public void editSong(Song selectedSong) throws Exception{
        //Update song in DAL layer (through the layers)
        songManager.editSong(selectedSong);

        //songsAvailable.update(selectedSong);
    }

}
