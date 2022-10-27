package com.grechi.drugstoreapi.repository;

import com.grechi.drugstoreapi.entity.Procedure;
import com.grechi.drugstoreapi.entity.ProcedureId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, ProcedureId> {

}
