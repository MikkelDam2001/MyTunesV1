package com.sea.mytunesv1.DAL;

import com.sea.mytunesv1.BE.Song;

import java.util.List;

public interface ISongAcces {
    List<Song> getAllSongs() throws Exception;

    Song createSong(Song newSong) throws Exception;

    void updateSong(Song song) throws Exception;

    void deleteSong (Song song) throws Exception;

}
