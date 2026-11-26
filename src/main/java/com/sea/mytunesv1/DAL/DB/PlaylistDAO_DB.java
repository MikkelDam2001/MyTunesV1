package com.sea.mytunesv1.DAL.DB;

//project imports
import com.sea.mytunesv1.BE.Playlist;
import com.sea.mytunesv1.DAL.IPlaylistDataAcces;

//java imports
import java.io.IOException;
import java.sql.*;
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

                playlists.add(new Playlist(id, name, songs, time));
            }

        }

        return playlists;
    }

    @Override
    public Playlist createPlaylist(Playlist newPlaylist) throws Exception {
        String sql = "INSERT INTO Playlist (Name, Songs, Time) VALUES (?,0,0);";

        try (Connection conn = dbConnector.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Bind parameters
            stmt.setString(1,newPlaylist.getName());

            // Run the specified SQL statement
            stmt.executeUpdate();

            // Get the generated ID from the DB
            ResultSet rs = stmt.getGeneratedKeys();
            int id = 0;

            if (rs.next()) {
                id = rs.getInt(1);
            }

            // laver playlist object and sender den igennem 3-lags
            Playlist createdPlaylist = new Playlist(id, newPlaylist.getName(),0,0);

            return createdPlaylist;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            throw new Exception("Could not create playlist", ex);
        }
    }


    @Override
    public void editPlaylist(Playlist playlist) throws Exception {

    }

    @Override
    public void deletePlaylist(Playlist playlist) throws Exception {

    }
}
