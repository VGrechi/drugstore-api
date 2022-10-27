package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.entity.Client;
import com.grechi.drugstoreapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public List<Client> getClients(){
        return clientRepository.findAll();
    }
}
