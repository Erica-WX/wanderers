package com.wanderers.wanderers.app.dao;

import com.wanderers.wanderers.app.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends CrudRepository<Users, Long> {

    @Query(value = "select * from users ", nativeQuery = true)
    List<Users> getAll();

    Optional<Users> findUsersByUsername(String username);
}
