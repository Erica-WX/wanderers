package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.model.Musician;
import com.wanderers.wanderers.app.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musician")
public class MusicianController {
    @Autowired
    private MusicianService musicianService;

    @RequestMapping("")
    public List<Musician> findList(Musician musician){return findList(musician);}
}
