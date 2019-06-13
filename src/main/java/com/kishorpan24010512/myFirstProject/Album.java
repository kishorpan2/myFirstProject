package com.kishorpan24010512.myFirstProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Album {

    @Id
    @GeneratedValue()
    long id;
    String title;
    String artist;
    int songCount;
    double length;
    String imageUrl;

   public Album(){}

    public Album(String title, String artist, int songCount, double length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;

    }

    public String toString() {
        return this.title + " by " + this.artist + "has"+ this.songCount + "of" + this.length + "with" +this.imageUrl;
    }
}
