package com.sea.mytunesv1.BLL.Song;

import com.sea.mytunesv1.BE.Song;

import java.util.ArrayList;
import java.util.List;

public class SongSearcher {

    public static List<Song> search(List<Song> allSongs, String query) {

        //her laves en ny arrayliste til at opbevare de returnerede sammenlignede sange som passer
        List<Song> searchResult = new ArrayList<>();

        //her tjekkes for hver sang i allsongs (sangliste) for sammenligningen af query og song.
        for(Song song : allSongs){
            if (compareToSongTitle(query, song)){
                searchResult.add(song);
            }
        }
        //her returneres de returnerede sammenlignede sange som passer
        return searchResult;

    }

    //ingen ide hvorfor det skal være static
    //her tjekker man om query er ens i forhold til titel og returnerer true eller false
    private static boolean compareToSongTitle(String query, Song song) {
        return song.getTitle().toLowerCase().contains(query.toLowerCase());
    }
}
