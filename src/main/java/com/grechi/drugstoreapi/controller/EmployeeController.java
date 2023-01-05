package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.dto.EmployeeDTO;
import com.grechi.drugstoreapi.entity.Employee;
import com.grechi.drugstoreapi.entity.Pharmaceutical;
import com.grechi.drugstoreapi.repository.EmployeeRepository;
import com.grechi.drugstoreapi.repository.PharmaceuticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private PharmaceuticalRepository pharmaceuticalRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public ResponseEntity<List<? extends Employee>> getEmployees(@RequestParam String funcao){
        List<? extends Employee> list = new ArrayList<>();
        if(funcao.equals("farmaceutico")){
            list = pharmaceuticalRepository.findAll();
        } else {
            list = employeeRepository.findAll();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public ResponseEntity<Void> postEmployee(@RequestBody EmployeeDTO employeeDTO){
        if(employeeDTO.getFuncao().equals("farmaceutico")){
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
