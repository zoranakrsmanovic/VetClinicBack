package com.example.mongo.controller;


import com.example.mongo.entity.Records;
import com.example.mongo.repository.iRecordsRepository;
import com.example.mongo.service.RecordsServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/pets")
public class RecordsController {

    @Autowired
    iRecordsRepository recordsRepository;
    @Autowired
    RecordsServise recordsServise;


    @GetMapping("/all")
    private List<Records> findAll() {return recordsRepository.findAll();}


    @GetMapping("/maxage/{maxAge}")
    public List<Records> getByAge(@PathVariable("maxAge") int maxAge){
        List<Records> records = this.recordsRepository.findAllByAgeLessThan(maxAge);

        return records;
    }

    @GetMapping("/findbyowner/{ownerId}")
    public List<Records> getByOwner(@PathVariable("ownerId") String ownerId){
        List<Records> records = this.recordsRepository.findAllByOwner(ownerId);

        return records;
    }

    @GetMapping("/findbyid/{id}")
    public Optional<Records> getById(@PathVariable("id") String id){
        Optional<Records> records = this.recordsRepository.findById(id) ;
        return records;
    }

    @GetMapping("/findbybreed/{breed}")
    public List<Records> getByBreed(@PathVariable("breed") String breed){
        List<Records> records = this.recordsRepository.findAllByBreed(breed);

        return records;
    }

    @GetMapping("/findbytype/{type}")
    public List<Records> getByType(@PathVariable("type") String type){
        List<Records> records = this.recordsRepository.findAllByType(type);

        return records;
    }

    @PutMapping("/add")
    @CrossOrigin(origins="*")
    public void insert(@RequestBody Records records){
        this.recordsRepository.insert(records);
    }

    @PostMapping("/update")
    @CrossOrigin(origins="*")
    public void update(@RequestBody Records records){
        this.recordsRepository.save(records);
    }


    @DeleteMapping("delete/{id}")
    @CrossOrigin(origins="*")
    private void deleteRecordById(@PathVariable("id")  String id){
        recordsRepository.deleteById(id);
    }



}
