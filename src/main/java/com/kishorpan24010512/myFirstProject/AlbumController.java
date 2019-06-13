package com.kishorpan24010512.myFirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

//    @PostMapping("/greetings")
//    public RedirectView addGreeting(@RequestParam String title, @RequestParam String artist) {
//        Album album = new Album(title,artist);
//        AlbumRepository.save(album);
//        return new RedirectView("/album");
//    }
}
