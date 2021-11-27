package com.sda.universityManagement.repository;

import com.sda.universityManagement.model.User;

import java.util.Set;

public interface UserRepository {
    Set<User> getAllUsers();

    User getUser(String username);

    void addUser(User user);

    void updateUser(String username, User user);
}
