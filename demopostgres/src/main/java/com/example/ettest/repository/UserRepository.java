package com.example.ettest.repository;

import com.example.ettest.entity.User;
import com.example.ettest.jwt.entity.UserJwt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("com.example.ettest.repository.UserRepository")
public interface UserRepository extends CrudRepository<User,String> {

  UserJwt findByUsername(String username);

  Iterable<User> findByFirstName(String firstName);
}
