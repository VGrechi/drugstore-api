package com.grechi.drugstoreapi.repository;

import com.grechi.drugstoreapi.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
