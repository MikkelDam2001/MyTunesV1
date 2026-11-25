package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.ISongDataAcces;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongDAO_DB implements ISongDataAcces {
    DBConnector dbConnector = new DBConnector();

    public SongDAO_DB() throws IOException {
    }

    @Override
    public List<Song> getAllSongs() throws Exception {
        List<Song> movies = new ArrayList<>();

        // get data from db
        // try-with-resources
        try (Connection conn = dbConnector.getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM Song";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                // transfer rows to arraylist
                int id = rs.getInt("Id");
                String title = rs.getString("Title");
                String artist = rs.getString("Artist");
                String category = rs.getString("Category");
                int time = rs.getInt("Time");
                String filePath = rs.getString("FilePath");


                movies.add(new Song(id, title, artist, category, time, filePath));
            }

        }

        return movies;
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
