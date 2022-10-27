package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.entity.Procedure;
import com.grechi.drugstoreapi.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
