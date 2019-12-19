package com.example.demo.helper;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserJSON;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User mapTo(UserJSON userJSON) {
        Assert.notNull(userJSON, "The bookJSON must not be null");
        User user = new User();
        user.setEmail(userJSON.getEmail());
        user.setNom(userJSON.getNom());
        user.setPrenom(userJSON.getPrenom());
        return user;
    }

    public UserJSON mapTo(User user) {
        Assert.notNull(user, "The user must not be null");
        UserJSON userJSON = new UserJSON();
        userJSON.setEmail(user.getEmail());
        userJSON.setId(user.getId());
        userJSON.setNom(user.getNom());
        userJSON.setPrenom(user.getPrenom());
        return userJSON;
    }

    public List<UserJSON> mapTo(List<User> userList) {
        Assert.notNull(userList, "The user list must not be null");
        return userList.stream().map(this::mapTo).collect(Collectors.toList());
    }
}
