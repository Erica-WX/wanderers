package com.wanderers.wanderers.app.dao;

import com.wanderers.wanderers.app.model.Band;
import com.wanderers.wanderers.sys.base.BaseDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BandRepository extends CrudRepository<Band, Long>{

    @Query(value = "select * from Band ", nativeQuery = true)
    List<Band> getAll();

    Optional<Band> findBandByName(String name);
}
