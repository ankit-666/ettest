package com.example.ettest.jwt.repository;

import com.example.ettest.jwt.entity.UserJwt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJwtRepository extends CrudRepository<UserJwt, Integer> {
}
