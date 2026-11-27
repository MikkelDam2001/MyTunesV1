package com.sea.mytunesv1.DAL.DB;

import com.sea.mytunesv1.BE.Song;
import com.sea.mytunesv1.DAL.ISongDataAcces;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongDAO_DB implements ISongDataAcces {
    DBConnector dbConnector = new DBConnector();

    public SongDAO_DB() throws IOException {
    }

    @Override
    public List<Song> getAllSongs() throws Exception {
        List<Song> songs = new ArrayList<>();

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


                songs.add(new Song(id, title, artist, category, time, filePath));
            }

        }

        return songs;
    }

    @Override
    public Song createSong(Song newSong) throws Exception {
        String sql = "INSERT INTO Song (Title, Artist, Category, Time, Filepath) VALUES (?,?,?,?,?);";

        try (Connection conn = dbConnector.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Bind parameters
            stmt.setString(1,newSong.getTitle());
            stmt.setString(2,newSong.getArtist());
            stmt.setString(3,newSong.getCategory());
            stmt.setInt(4,newSong.getTime());
            stmt.setString(5,newSong.getFilepath());


            // Run the specified SQL statement
            stmt.executeUpdate();

            // Get the generated ID from the DB
            ResultSet rs = stmt.getGeneratedKeys();
            int id = 0;

            if (rs.next()) {
                id = rs.getInt(1);
            }

            // Create song object and send up the layers
            Song createdSong = new Song(id, newSong.getTitle(), newSong.getArtist(), newSong.getCategory(), newSong.getTime(), newSong.getFilepath());

            return createdSong;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            throw new Exception("Could not create song", ex);
        }
    }

    @Override
    public void editSong(Song song) throws Exception {

    }

    @Override
    public void deleteSong(Song song) throws Exception {
        String sql = "DELETE FROM Song WHERE Id = ?";

        // try-with-resources
        try (Connection conn = dbConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            // bind parameters til ?
            stmt.setInt(1, song.getId());

            // run the sql command
            stmt.executeUpdate();
        }
    }
}
