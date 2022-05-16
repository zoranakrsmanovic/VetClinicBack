package com.example.mongo.repository;

import com.example.mongo.entity.PreviousExaminations;
import com.example.mongo.entity.Records;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface iPreviousExaminationsRepository extends MongoRepository<PreviousExaminations, String> {
   List<PreviousExaminations> findAllByPetOrderByDateOfExaminationDesc(String pet);

}
