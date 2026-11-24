package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.ISongDataAcces;

import java.util.ArrayList;
import java.util.List;

public class SongDAO_Mock implements ISongDataAcces {

    private List <Song> allSongs;

    public SongDAO_Mock(){
        allSongs = new ArrayList<>();
        allSongs.add(new Song(1,"SongExample","ArtistExample",2026,300));
    }


    @Override
    public List<Song> getAllSongs() throws Exception {
        return allSongs;
    }

    @Override
    public Song createSong(Song newSong) throws Exception {
        return null;
    }

    @Override
    public void editSong(Song song) throws Exception {

    }

    @Override
    public void deleteSong(Song song) throws Exception {

    }
}
