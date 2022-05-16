package com.example.mongo.repository;

import com.example.mongo.entity.Records;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface iRecordsRepository extends MongoRepository<Records, String> {
    @Override
    List<Records> findAll();
    List<Records> findAllByAgeLessThan(int maxAge);
    List<Records> findAllByOwner(String ownerId);
    List<Records> findAllByBreed(String breed);
    List<Records> findAllByType(String type);
    Optional<Records> findById(String id);



}
