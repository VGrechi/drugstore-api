package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.entity.Pharmaceutical;
import com.grechi.drugstoreapi.repository.PharmaceuticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pharmaceuticals")
public class PharmaceuticalController {

    @Autowired
    private PharmaceuticalRepository pharmaceuticalRepository;

    @GetMapping("/")
    public List<Pharmaceutical> getPharmaceuticals(){
        return pharmaceuticalRepository.findAll();
    }
}
