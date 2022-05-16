package com.example.mongo.controller;

import com.example.mongo.entity.Appointments;
import com.example.mongo.entity.Client;
import com.example.mongo.entity.PreviousExaminations;
import com.example.mongo.entity.User;
import com.example.mongo.repository.iAppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("appointments")
public class AppointmentsController {

    @Autowired
    iAppointmentsRepository appointmentsRepository;

    @GetMapping("/all")
    @CrossOrigin(origins="*")
    private List<Appointments> findAll() {return appointmentsRepository.findAll();}

    @GetMapping("find/{date}")
    @CrossOrigin(origins="*")
    private List<Appointments> getAllByDate(@PathVariable("date") String date){
        return appointmentsRepository.findAllByDate(date);
    }

    @PostMapping("add")
    @CrossOrigin(origins="*")
    public void insert(@RequestBody Appointments a){
        this.appointmentsRepository.insert(a);
    }


    @DeleteMapping("delete/{id}")
    @CrossOrigin(origins="*")
    private void deleteAById(@PathVariable("id")  String id){
        appointmentsRepository.deleteById(id);
    }
}
