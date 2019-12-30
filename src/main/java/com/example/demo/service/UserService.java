package com.example.demo.service;

import com.example.demo.helper.UserMapper;
import com.example.demo.pojo.*;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    public UserJSON getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return userMapper.mapTo(user);
    }

    public UserJSON getUserById(long id) {
        User user = userRepository.selectById(id);
        return userMapper.mapTo(user);
    }

    public boolean identify(AuthentificationJSON auth) {
        User user = userRepository.identify(auth.getEmail(), auth.getPassword());
        return (user != null);
    }

    public UserJSON createUser(UserJSON userJSON) {
        User user = userRepository.save(userMapper.mapTo(userJSON));
        return userMapper.mapTo(user);
    }

    public List<UserJSON> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userMapper.mapTo(userList);
    }
}
