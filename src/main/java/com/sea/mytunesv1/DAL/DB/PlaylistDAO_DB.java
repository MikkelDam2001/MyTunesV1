package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.DAL.IPlaylistDataAcces;

import java.util.List;

public class PlaylistDAO_DB implements IPlaylistDataAcces {
    @Override
    public List<Playlist> getAllPlaylists() throws Exception {
        return List.of();
    }

    @Override
    public Playlist createPlaylist(Playlist newPlaylist) throws Exception {
        return null;
    }

    @Override
    public void updatePlaylist(Playlist playlist) throws Exception {

    }

    @Override
    public void deletePlaylist(Playlist playlist) throws Exception {

    }
}
