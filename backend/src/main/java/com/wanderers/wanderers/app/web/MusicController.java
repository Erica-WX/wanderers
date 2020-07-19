package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.model.Music;
import com.wanderers.wanderers.app.service.impl.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicServiceImpl musicService;

    @RequestMapping("")
    public List<Music> findList(Music music){return musicService.findList(music);}

    @RequestMapping("all")
    public List<Music> findAll(Music music){return musicService.findAll(music);}

    @PostMapping("save")
    public void insert(@RequestBody Music music){musicService.save(music);}
}

