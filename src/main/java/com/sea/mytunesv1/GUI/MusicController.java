package com.sea.mytunesv1.GUI;

// JavaFX imports
import com.sea.mytunesv1.BE.Song;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
// Java imports
import java.net.URL;

public class MusicController {


    private MediaPlayer mediaPlayer;

    @FXML
    public void playSong(Song song, Label lblCurrentSong) {
        try {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.dispose();
            }
            URL url = getClass().getResource("/SongFiles/" + song.getFilepath());
            Media media = new Media(url.toExternalForm());

            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            lblCurrentSong.setText(song.getTitle() + " - " + song.getArtist());
        } catch (Exception e) {
            lblCurrentSong.setText("Could not play: " + song.getTitle());
            e.printStackTrace();
        }
    }
}
