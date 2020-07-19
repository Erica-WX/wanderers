package com.wanderers.wanderers.app.dao;

import com.wanderers.wanderers.app.model.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends CrudRepository<Tag, Long> {

    @Query(value = "select * from Tag ", nativeQuery = true)
    List<Tag> getAll();

    Optional<Tag> findTagById(String tagId);
}

