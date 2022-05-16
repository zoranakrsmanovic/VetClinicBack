package com.example.mongo.service;

import com.example.mongo.entity.Client;
import com.example.mongo.entity.PreviousExaminations;
import com.example.mongo.entity.Records;

import com.example.mongo.repository.iClientRepository;
import com.example.mongo.repository.iPreviousExaminationsRepository;
import com.example.mongo.repository.iRecordsRepository;
import com.jayway.jsonpath.Criteria;
import lombok.var;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.time.LocalDate;
import java.util.List;

@Service()
public class RecordsServise {

    @Autowired
    iRecordsRepository recordsRepository;
    @Autowired
    iClientRepository clientRepository;
    @Autowired
    iPreviousExaminationsRepository previousExaminationsRepository;










}
