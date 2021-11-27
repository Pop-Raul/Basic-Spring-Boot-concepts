package com.sda.universityManagement.repository;

import com.sda.universityManagement.model.User;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class UserMockRepository2 implements UserRepository{
    @Override
    public Set<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(String username, User user) {

    }
}
