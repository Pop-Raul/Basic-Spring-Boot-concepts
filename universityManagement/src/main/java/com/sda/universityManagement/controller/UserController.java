package com.sda.universityManagement.controller;

import com.sda.universityManagement.repository.UserMockRepository;
import com.sda.universityManagement.repository.UserRepository;
import com.sda.universityManagement.service.UserService;
import com.sda.universityManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/validate")
    public String validateUser(@RequestBody User user){
        return userService.validateUser(user);
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public Set<User> getUsers(){
        return userService.getUsers();
    }
}
