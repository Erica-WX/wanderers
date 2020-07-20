package com.wanderers.wanderers.dao;

import com.wanderers.wanderers.app.dao.UsersRepository;
import com.wanderers.wanderers.app.model.Band;
import com.wanderers.wanderers.app.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

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

    @Test
    public void addNewUser() {
        Band band = new Band();
        Users newUser = new Users("test", "test", 0 , "abc", "hahaha", 100, 0 , band);
        usersRepository.save(newUser);
    }

    @Test
    public void addSimpleUser(){
        Users simpleUser = new Users("simple","password",1);
        usersRepository.save(simpleUser);
    }

    @Test
    public void findUserByUsername() {

        String name1 = "Joe";
        Optional<Users> option1 = usersRepository.findUsersByUsername(name1);
        if(option1.isPresent()) {
            Users user1 = option1.get();
            System.out.println("用户" + name1 + "的ID是：" + user1.getId());
        }else {
            System.out.println("用户" + name1 + "不存在。");
        }
    }
}
