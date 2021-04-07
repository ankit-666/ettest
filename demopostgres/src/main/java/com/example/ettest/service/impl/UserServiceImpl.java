package com.example.ettest.service.impl;

import com.example.ettest.entity.User;
import com.example.ettest.repository.UserRepository;
import com.example.ettest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@org.springframework.transaction.annotation.Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
//    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public User save(User user) {
        return userRepository.save(user);
    }


    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        Iterable<User> employeeIterable = userRepository.findByFirstName(firstName);
        List<User> userList = new ArrayList<>();
        employeeIterable.forEach(userList::add);
        return userList;
    }
}
