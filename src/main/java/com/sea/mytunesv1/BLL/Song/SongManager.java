package com.sea.mytunesv1.BLL.Song;

// Project imports
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.DB.SongDAO_DB;
import com.sea.mytunesv1.DAL.DB.SongDAO_Mock;
import com.sea.mytunesv1.DAL.ISongDataAcces;

// Java imports
import java.io.IOException;
import java.util.List;

public class SongManager {
    private SongSearcher songSearcher = new SongSearcher();
    private ISongDataAcces songDAO;

    //vælger hvorfra vi vil have data (enten database eller mock..)
    public SongManager() throws IOException {
        //songDAO = new SongDAO_Mock();
        songDAO = new SongDAO_DB();
    }

    public List<Song> getAllSongs() throws Exception {
        return songDAO.getAllSongs();
    }
    public Song createSong(Song newSong) throws Exception {
        return songDAO.createSong(newSong);
    }

    public List<Song> searchSongs(String query) throws Exception {
        List<Song> allSongs = getAllSongs();
        List<Song> searchResult = SongSearcher.search(allSongs, query);
        return searchResult;
    }

    public void deleteSong(Song selectedSong) throws Exception {
        songDAO.deleteSong(selectedSong);
    }
}
