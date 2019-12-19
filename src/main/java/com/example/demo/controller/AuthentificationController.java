package com.example.demo.controller;


import com.example.demo.pojo.AuthentificationJSON;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Api(tags = {"Login"})
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "login")
public class AuthentificationController {

    @Resource
    UserService userService;

    @ApiOperation(value =  "Verify User")
    @RequestMapping(method = RequestMethod.POST, headers = {"Content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean confirmConnection(@ApiParam(value = "email and password") @RequestBody AuthentificationJSON auth) {
        return userService.authentify(auth);
    }

}
