package com.wemb.renobit.controller;

import java.util.*;

import com.wemb.renobit.entity.User;
import com.wemb.renobit.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/user")
@Api(value="User 관련 api입니다.", description = "User Api 입니다.")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value="user", notes="response user list")
    List<User> getUserList() {
        return userService.GetUserList();
    }

    @PostMapping(value = "/login")
    @ApiOperation(value="user", notes="response user list")
    List<User> getUserList(@RequestBody User user) {
        return userService.GetUserList();
    }
}