package org.sang.controller;

import org.sang.service.UserService;
import org.sang.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public RespBean login(String username,String password){
        return userService.login(username,password);
    }
}
