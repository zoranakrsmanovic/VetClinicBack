package com.example.mongo.controller;

import com.example.mongo.entity.Client;
import com.example.mongo.entity.PreviousExaminations;
import com.example.mongo.entity.Records;
import com.example.mongo.repository.iClientRepository;
import com.example.mongo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    iClientRepository clientRepository;
    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    @CrossOrigin(origins="*")
    private List<Client> findAll() {return clientRepository.findAll();}

    @GetMapping("find/{city}")
    @CrossOrigin(origins="*")
    private List<Client> findAllCByCity(@PathVariable("city") String city){
        return clientService.findAllClientsByCity(city);
    }
    @GetMapping("/findbyid/{id}")
    public Client getById(@PathVariable("id") String id){
        Client clients = this.clientService.findClientById(id);
        return clients;
    }

    @PutMapping("/add")
    @CrossOrigin(origins="*")
    public void insert(@RequestBody Client client){
        this.clientRepository.insert(client);
    }

    @PostMapping("/update")
    @CrossOrigin(origins="*")
    public void update(@RequestBody Client client){
        this.clientRepository.save(client);
    }

    @DeleteMapping("delete/{id}")
    @CrossOrigin(origins="*")
    private void deleteClientById(@PathVariable("id")  String id){
        clientService.deleteById(id);
    }





}
