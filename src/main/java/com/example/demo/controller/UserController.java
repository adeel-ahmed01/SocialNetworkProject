package com.example.demo.controller;


import com.example.demo.pojo.UserJSON;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(tags = "User")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "profile", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "Create user")
    @RequestMapping(method = RequestMethod.POST, headers = {"Content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJSON addUser(@ApiParam(value = "User to add", required = true) @Valid @RequestBody UserJSON user) {
        return userService.createUser(user);
    }

}
