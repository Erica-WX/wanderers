package com.wanderers.wanderers.app.service.impl;

import com.wanderers.wanderers.app.dao.UsersRepository;
import com.wanderers.wanderers.app.model.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UserDetailsService {

    private UsersRepository usersRepository;
    /**
     * 通过用户名获得用户对象
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return usersRepository.findUsersByUsername(username).get();
    }
}