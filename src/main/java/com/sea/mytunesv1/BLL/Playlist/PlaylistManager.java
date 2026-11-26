package com.sea.mytunesv1.BLL.Playlist;

// Project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.BLL.Playlist.PlaylistSearcher;
import com.sea.mytunesv1.DAL.DB.PlaylistDAO_DB;
import com.sea.mytunesv1.DAL.DB.SongDAO_DB;
import com.sea.mytunesv1.DAL.IPlaylistDataAcces;


// Java imports
import java.io.IOException;
import java.util.List;

public class PlaylistManager {
    private PlaylistSearcher playlistSearcher = new PlaylistSearcher();
    private IPlaylistDataAcces playlistDAO;

    //vælger hvorfra vi vil have data (enten database eller mock..)
    public PlaylistManager() throws IOException {

        playlistDAO = new PlaylistDAO_DB();
    }

    public List<Playlist> getAllPlaylists() throws Exception {
        return playlistDAO.getAllPlaylists();
    }

    public List<Playlist> searchPlaylists(String query) throws Exception {
        List<Playlist> allPlaylists = getAllPlaylists();
        List<Playlist> searchResult = PlaylistSearcher.search(allPlaylists, query);
        return searchResult;
    }
}
