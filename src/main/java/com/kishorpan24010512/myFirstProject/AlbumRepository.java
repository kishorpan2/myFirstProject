package com.kishorpan24010512.myFirstProject;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album, Long> {
    public List<Album> findAlbumByTitle(String Title);
}
