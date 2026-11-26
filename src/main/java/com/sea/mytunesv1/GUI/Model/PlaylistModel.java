package com.sea.mytunesv1.GUI.Model;

import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BLL.Playlist.PlaylistManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class PlaylistModel {

    private ObservableList <Playlist> playlistsAvailable;
    private PlaylistManager playlistManager;

    public void PlaylistModel() throws Exception {
        playlistManager = new PlaylistManager();
        playlistsAvailable = FXCollections.observableArrayList();
        playlistsAvailable.addAll(playlistManager.getAllPlaylists());
    }


    public ObservableList<Playlist> getPlaylistsAvailable() {
        return playlistsAvailable;
    }

    public void searchplaylists(String query) throws Exception {
        List<Playlist> searchResults = playlistManager.searchPlaylists(query);
        playlistsAvailable.clear();
        playlistsAvailable.addAll(searchResults);
    }


}
