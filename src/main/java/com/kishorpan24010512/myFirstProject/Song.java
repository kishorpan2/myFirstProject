package com.kishorpan24010512.myFirstProject;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long id;
    public String title;
    public int length;
    public int trackNumber;

    @ManyToOne
    public Album album;

    public Song (){}
    public Song (String title,int length,int trackNumber, Album album ){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }


}
