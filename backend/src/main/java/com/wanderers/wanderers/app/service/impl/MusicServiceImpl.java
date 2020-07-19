package com.wanderers.wanderers.app.service.impl;

import com.wanderers.wanderers.app.dao.MusicRepository;
import com.wanderers.wanderers.app.model.Music;
import com.wanderers.wanderers.sys.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class MusicServiceImpl{
    private MusicRepository musicRepository;

    public List<Music> findList(Music music) {
        return musicRepository.findMusicByName(music.getName()).get();
    }

    public List<Music> findAll(Music music) {
        List<Music> list = musicRepository.getAll();
        return list;
    }

    public void save(Music music) {
        musicRepository.save(music);
    }
}
