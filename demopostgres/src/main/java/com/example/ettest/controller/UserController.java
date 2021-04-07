package com.example.ettest.controller;

import com.example.ettest.entity.User;
import com.example.ettest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/{employeeId}")
    User findById(@PathVariable("employeeId") int id) {
        return userService.findById(id);
    }

    @GetMapping(value = "/findAll")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/findByFirstNam/{firstName}")
    List<User> findByFirstName(@PathVariable("firstName")String name) {
        return userService.findByFirstName(name);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping(value = "/{employeeId}")
    public void DeleteById(@PathVariable("employeeId") int id) {
        userService.deleteById(id);
    }

}
