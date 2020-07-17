package com.wanderers.wanderers.dao;

import com.wanderers.wanderers.app.dao.UsersRepository;
import com.wanderers.wanderers.app.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersRepositoryTest {

    private UsersRepository usersRepository;

    @Autowired
    public void setUsersRepository(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Test
    public void getUsersTest() {

        List<Users> list = usersRepository.getAll();
        for(Users u: list) {
            System.out.println("username:" + u.getUsername() + " password:" + u.getPassword());
        }

    }
}
