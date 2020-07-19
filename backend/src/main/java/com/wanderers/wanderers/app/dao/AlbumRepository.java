package com.wanderers.wanderers.app.dao;

import com.wanderers.wanderers.app.model.Album;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends CrudRepository<Album, Long> {

    @Query(value = "select * from Album ", nativeQuery = true)
    List<Album> getAll();
}
