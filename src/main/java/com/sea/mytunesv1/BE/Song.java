package com.sea.mytunesv1.BE;

public class Song {
    private int id;
    private String title;
    private String artist;
    private int year;
    private int time;


    public Song (int id, String title, String artist, int year, int time) {

        this.id = id;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.time = time;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
