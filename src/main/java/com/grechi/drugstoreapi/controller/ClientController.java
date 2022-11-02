package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.controller.validator.ClientValidator;
import com.grechi.drugstoreapi.dto.ResponseError;
import com.grechi.drugstoreapi.entity.Client;
import com.grechi.drugstoreapi.exception.ValidationException;
import com.grechi.drugstoreapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public ResponseEntity<List<Client>> getClients(){
        List<Client> clients = clientRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(clients);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public ResponseEntity postClient(@RequestBody Client client) throws ValidationException {
        if(Objects.nonNull(client.getIdCliente())){
            client.setIdCliente(null);
        }

        ClientValidator.validate(client);

        clientRepository.save(client);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
