package com.grechi.drugstoreapi.repository;

import com.grechi.drugstoreapi.entity.Employee;
import com.grechi.drugstoreapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
