package com.kishorpan24010512.myFirstProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {
    @Test
    public  void testToString(){
        //String title, String artist, int songCount, double length, String imageUrl
        Album album = new Album("Yellow Submarine","Beatles",10,3.5,"this is awesome" );

        assertEquals("", "Yellow Submarine by Beatleshas10of3.5withthis is awesome", album.toString());


    }

}