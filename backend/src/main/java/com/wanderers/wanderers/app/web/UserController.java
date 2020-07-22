package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.app.model.Users;
import com.wanderers.wanderers.app.payload.NewUserResponse;
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
    public String signUp(@RequestBody NewUserResponse newUserResponse){
        // 前端返回值需要与Users的属性一一对应，写null或""都可以，不能空着
        System.out.println("In User controller");
        System.out.println(newUserResponse.getUsername());
        System.out.println(newUserResponse.getPassword());
        // user.setPassword(passwordEncoder.encode(user.getPassword()));
        // userService.saveUser(user);
        return "OK";
    }
}
