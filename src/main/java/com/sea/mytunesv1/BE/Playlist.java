package com.sea.mytunesv1.BE;

public class Playlist {
    private String name;
    private int songs;
    private int time;

    public Playlist(String name, int songs, int time){
        this.name = name;
        this.songs = songs;
        this.time = time;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
