package com.kishorpan24010512.myFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller

public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;


    @GetMapping("/album")

    public String getAllAlbums(Model m) {

        Iterable<Album> album = albumRepository.findAll();
        m.addAttribute("album", album);
        return "album";
    }

    @GetMapping("/song")
    public String addNewsSong(Model m) {
        Iterable<Song> song = songRepository.findAll();
        String albumWasNotFoundErrorMessage = "The album does not exist";
        m.addAttribute("song",song);
        m.addAttribute("song", song);
        return "song";
    }

    @PostMapping("/album")

    public RedirectView addAlbumTodatabase(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount,
                                           @RequestParam double length, @RequestParam String imageUrl) {

        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);


        return new RedirectView("/album");
    }

    @PostMapping("/song")


    public RedirectView addSongToDatabase(@RequestParam String title, @RequestParam int length,
                                          @RequestParam int trackNumber, @RequestParam String album, Model m
  ) {
        List<Album> albumByTitle = albumRepository.findAlbumByTitle(album);

        if(albumByTitle.size() > 0){

        Song song = new Song(title, length, trackNumber, albumByTitle.get(0));

        songRepository.save(song);


        return new RedirectView("/song");

        }else{
            return new RedirectView("/song");
        }

    }

    @GetMapping("/individualAlbum/{albumTitle}")

    public String showIndivAlbum(@PathVariable String albumTitle, Model m){

        List<Album> albumToDisplay = albumRepository.findAlbumByTitle(albumTitle);

        m.addAttribute("albumToDisplay",albumToDisplay.get(0));

        return "individualAlbum";


    }

}
