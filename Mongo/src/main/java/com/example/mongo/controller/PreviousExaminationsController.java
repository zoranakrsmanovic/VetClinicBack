package com.example.mongo.controller;


import com.example.mongo.entity.PreviousExaminations;
import com.example.mongo.entity.Records;
import com.example.mongo.repository.iPreviousExaminationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examinations")
public class PreviousExaminationsController {

    @Autowired
    iPreviousExaminationsRepository previousExaminationsRepository;

    @PutMapping("/add")
    @CrossOrigin(origins="*")
    public void insert(@RequestBody PreviousExaminations examinations){
        this.previousExaminationsRepository.insert(examinations);
    }

    @GetMapping("/all")
    private List<PreviousExaminations> findAll() {return previousExaminationsRepository.findAll();}

    @GetMapping("/findbypet/{pet}")
    public List<PreviousExaminations> getByPet(@PathVariable("pet") String pet){
        List<PreviousExaminations> records = this.previousExaminationsRepository.findAllByPetOrderByDateOfExaminationDesc(pet);
        return records;
    }







}

