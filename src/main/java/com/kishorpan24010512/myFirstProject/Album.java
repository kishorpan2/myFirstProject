package com.kishorpan24010512.myFirstProject;

import javax.persistence.*;
import java.util.List;

@Entity


public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public String artist;
    public int songCount;
    public double length;
    public String imageUrl;

    @OneToMany(mappedBy ="album")
    public List<Song>songs;

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
