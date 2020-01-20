package com.example.demo.controller;


import com.example.demo.pojo.TopicJSON;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserJSON;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Api(tags = "User")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "Create user")
    @RequestMapping(value = "register", method = RequestMethod.POST, headers = {"Content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJSON addUser(@ApiParam(value = "User to add", required = true) @Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    @ApiOperation(value = "Get all Users")
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<UserJSON> getAll() {
        return userService.getAllUsers();
    }
}
