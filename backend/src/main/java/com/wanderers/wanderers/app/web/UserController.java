package com.wanderers.wanderers.app.web;

import com.wanderers.wanderers.sys.security.User;
import com.wanderers.wanderers.sys.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signUp")
    public User signUp(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return user;
    }
}
