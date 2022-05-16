package com.example.mongo.repository;

import com.example.mongo.entity.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface iClientRepository extends MongoRepository<Client, String> {


    List<Client> findAll();
    List<Client> findAllByCity(String city);
    Client findAllById(String id);


}
