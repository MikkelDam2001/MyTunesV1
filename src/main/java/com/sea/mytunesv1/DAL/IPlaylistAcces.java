package com.sea.mytunesv1.DAL;

import com.sea.mytunesv1.BE.Playlist;

import java.util.List;

public interface IPlaylistAcces{
    List<Playlist> getAllPlaylists() throws Exception;

    Playlist createPlaylist(Playlist newPlaylist) throws Exception;

    void updatePlaylist(Playlist playlist) throws Exception;

    void deletePlaylist(Playlist playlist) throws Exception;

}
