package com.kishorpan24010512.myFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller

public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")

    public String getAllAlbums(Model m) {

        Iterable<Album> album = albumRepository.findAll();
        m.addAttribute("album", album);
        return "album";
    }
//    @PostMapping("/album")
////    @PostMapping("/add")
//    public RedirectView create(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount,
//                               @RequestParam double length, @RequestParam String imageUrl) {
//
//        Album album = new Album(title,artist,songCount,length,imageUrl);
//        albumRepository.save(album);
//
//
//        return new RedirectView("/album");
////        return new RedirectView("/add");
//
//    }
    @PostMapping("/album")
//    @PostMapping("/add")
    public RedirectView create1(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount,
                                @RequestParam double length, @RequestParam String imageUrl) {

        Album album = new Album(title,artist,songCount,length,imageUrl);
       albumRepository.save(album);


        return new RedirectView("/album");
//        return new RedirectView("/add");

    }
}
