package com.wanderers.wanderers.app.dao;

import com.wanderers.wanderers.app.model.Music;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MusicRepository extends CrudRepository<Music, Long> {

    @Query(value = "select * from Music ", nativeQuery = true)
    List<Music> getAll();

    Optional<Music> findMusicByMusicName(String musicName);
}

