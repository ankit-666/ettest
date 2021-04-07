package com.example.ettest.service;

import com.example.ettest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);
    User findById(String id);
    void deleteById(String id);
    List<User> findByFirstName(String name);
}
