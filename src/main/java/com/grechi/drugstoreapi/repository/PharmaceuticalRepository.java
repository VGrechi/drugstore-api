package com.grechi.drugstoreapi.repository;

import com.grechi.drugstoreapi.entity.Pharmaceutical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmaceuticalRepository extends JpaRepository<Pharmaceutical, Integer> {

}
