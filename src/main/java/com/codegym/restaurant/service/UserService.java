package com.codegym.restaurant.service;


import com.codegym.restaurant.model.User;
import com.codegym.restaurant.security.UserPrincipal;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    Iterable<User> findAll();
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
