package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.model.Album;
import com.wanderers.wanderers.app.service.impl.AlbumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumServiceImpl albumService;

//    @RequestMapping("")
//    public Album find(Album album){return albumService.find(album);}

    @RequestMapping("all")
    public List<Album> findAll(Album album){return albumService.findAll(album);}
}
