package com.sda.universityManagement.service;

import com.sda.universityManagement.repository.UserMockRepository;
import com.sda.universityManagement.model.User;
import com.sda.universityManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("userMockRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String validateUser(User user){
        for (User searchUser: userRepository.getAllUsers()) {
            if(searchUser.getUsername().equals(user.getUsername())){
                System.out.println("Username exists in the database");
                return "Username exists in the database";
            }
        }
        System.out.println("Username does not exist in the database");
        return "Username does not exist in the database";
    }

    public Set<User> getUsers() {
        return userRepository.getAllUsers();
    }
}
