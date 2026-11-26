package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.DAL.IPlaylistDataAcces;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDAO_DB implements IPlaylistDataAcces {

    DBConnector dbConnector = new DBConnector();

    public PlaylistDAO_DB() throws IOException{

    }


    @Override
    public List<Playlist> getAllPlaylists() throws Exception {
        List<Playlist> playlists = new ArrayList<>();

        // get data from db
        // try-with-resources
        try (Connection conn = dbConnector.getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM Playlist";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                // transfer rows to arraylist
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                int songs = rs.getInt("Songs");
                int time = rs.getInt("Time");

                playlists.add(new Playlist(name, songs, time));
            }

        }

        return playlists;
    }

    @Override
    public Playlist createPlaylist(Playlist newPlaylist) throws Exception {
        return null;
    }

    @Override
    public void editPlaylist(Playlist playlist) throws Exception {

    }

    @Override
    public void deletePlaylist(Playlist playlist) throws Exception {

    }
}
