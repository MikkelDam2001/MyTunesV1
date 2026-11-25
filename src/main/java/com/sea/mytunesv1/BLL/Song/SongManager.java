package com.sea.mytunesv1.BLL.Song;

// Project imports
import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.DB.SongDAO_Mock;
import com.sea.mytunesv1.DAL.ISongDataAcces;

// Java imports
import java.util.List;

public class SongManager {
    private SongSearcher songSearcher = new SongSearcher();
    private ISongDataAcces songDAO;

    public SongManager() {
        songDAO = new SongDAO_Mock(); }

    public List<Song> getAllSongs() throws Exception {
        return songDAO.getAllSongs();
    }

    public List<Song> searchSongs(String query) throws Exception {
        List<Song> allSongs = getAllSongs();
        List<Song> searchResult = SongSearcher.search(allSongs, query);
        return searchResult;
    }
}
