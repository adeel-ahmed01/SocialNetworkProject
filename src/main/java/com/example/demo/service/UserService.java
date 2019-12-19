package com.example.demo.service;

import com.example.demo.helper.UserMapper;
import com.example.demo.pojo.AuthentificationJSON;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserJSON;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    public UserJSON getUser(String email) {
        User user = userRepository.findByEmail(email);
        return userMapper.mapTo(user);
    }

    public boolean authentify(AuthentificationJSON auth) {
        User user = userRepository.authentify(auth.getEmail(), auth.getPassword());
        return (user != null);
    }

}
