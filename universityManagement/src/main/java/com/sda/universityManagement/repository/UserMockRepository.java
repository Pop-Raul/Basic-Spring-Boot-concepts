package com.sda.universityManagement.repository;

import com.sda.universityManagement.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
//@Profile("dev")
public class UserMockRepository implements UserRepository{
    private Set<User> users = new HashSet<>();

    {
        users.add(new User("123", "123", "georgel@gmail.com"));
        users.add(new User("1234", "1234", "ionel@gmail.com"));
        users.add(new User("1235", "1235", "mirel@gmail.com"));
    }

    public Set<User> getUsers() {
        return users;
    }

    @Override
    public Set<User> getAllUsers() {
        return getUsers();
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
