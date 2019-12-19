package com.example.demo.controller;


import com.example.demo.pojo.AuthentificationJSON;
import com.example.demo.pojo.UserJSON;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "User")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "profile", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Resource
    UserService userService;


}
