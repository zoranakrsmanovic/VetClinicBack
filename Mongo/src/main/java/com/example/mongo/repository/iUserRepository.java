package com.example.mongo.repository;

import com.example.mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface iUserRepository extends MongoRepository<User, String> {
    User findByEmailAndPassword(String email,String password);

}
