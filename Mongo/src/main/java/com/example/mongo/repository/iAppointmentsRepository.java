package com.example.mongo.repository;


import com.example.mongo.entity.Appointments;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface iAppointmentsRepository extends MongoRepository<Appointments, String> {


    List<Appointments> findAllByDate(String date);
}
