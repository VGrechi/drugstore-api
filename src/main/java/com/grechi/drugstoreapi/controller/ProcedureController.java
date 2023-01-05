package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.dto.ProcedureDTO;
import com.grechi.drugstoreapi.entity.Procedure;
import com.grechi.drugstoreapi.entity.Product;
import com.grechi.drugstoreapi.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/procedures")
public class ProcedureController {

    @Autowired
    private ProcedureRepository procedureRepository;

    @GetMapping("/")
    public List<Procedure> getProcedures(){
        return procedureRepository.findAll();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public ResponseEntity postProcedure(@RequestBody ProcedureDTO procedureDTO) {
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
