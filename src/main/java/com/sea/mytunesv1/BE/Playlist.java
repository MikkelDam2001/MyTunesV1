package com.sea.mytunesv1.BE;

public class Playlist {
    private int id;
    private String name;
    private int songs;
    private int time;

    public Playlist(int id,String name, int songs, int time){
        this.name = name;
        this.songs = songs;
        this.time = time;
        this.id = id;
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

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

}
