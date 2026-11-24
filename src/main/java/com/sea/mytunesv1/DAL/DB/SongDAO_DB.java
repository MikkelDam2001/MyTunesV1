package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.ISongDataAcces;

import java.util.List;

public class SongDAO_DB implements ISongDataAcces {
    @Override
    public List<Song> getAllSongs() throws Exception {
        return List.of();
    }

    @Override
    public Song createSong(Song newSong) throws Exception {
        return null;
    }

    @Override
    public void updateSong(Song song) throws Exception {

    }

    @Override
    public void deleteSong(Song song) throws Exception {

    }
}
