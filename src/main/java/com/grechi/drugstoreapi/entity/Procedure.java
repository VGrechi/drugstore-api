package com.grechi.drugstoreapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Immutable
@Table(name = "procedimento")
@Data
public class Procedure {

    @EmbeddedId
    private ProcedureId procedureId;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "data_hora")
    private Date dataHora;

}
