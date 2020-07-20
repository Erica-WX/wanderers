package com.wanderers.wanderers.app.service.impl;

import com.wanderers.wanderers.app.dao.AlbumRepository;
import com.wanderers.wanderers.app.model.Album;
import com.wanderers.wanderers.app.service.sev.AlbumService;
import com.wanderers.wanderers.sys.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private AlbumRepository albumRepository;
    public List<Album> findAll(Album album) {
        return albumRepository.getAll();
    }
}
