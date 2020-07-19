package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.model.Users;
import com.wanderers.wanderers.app.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UsersServiceImpl userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signUp")
    public Users signUp(@RequestBody Users user){
        // 前端返回值需要与Users的属性一一对应，写null或""都可以，不能空着
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.saveUser(user);
        return user;
    }
}
