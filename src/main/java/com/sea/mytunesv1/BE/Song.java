package com.sea.mytunesv1.BE;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.io.File;
import java.util.Locale;

public class Song {
    private int id;
    private String title;
    private String artist;
    private int year;
    private int time;
    private String category;
    private String filepath;


    public Song (int id, String title, String artist, int year, int time) {

        this.id = id;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.time = time;
        this.category = category;
        this.filepath = filepath;

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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public String getFilepath(){
        return filepath;
    }
    public void setFilepath(String filepath){
        this.filepath = filepath;
    }

}
