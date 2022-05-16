package com.example.mongo.service;

import com.example.mongo.entity.Client;

import com.example.mongo.repository.iClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;

@Service()
public class ClientService {

    @Autowired
    iClientRepository clientRepository;


    public List<Client> findAllClientsByCity(String city){
        return clientRepository.findAllByCity(city);
    }

    public Client findClientById(String id){
        return clientRepository.findAllById(id);
    }

    public void deleteById(String id) {
        clientRepository.deleteById(id);
    }



}
