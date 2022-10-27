package com.grechi.drugstoreapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Immutable
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Employee {

    @Id
    @Column(name = "inss")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inss;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "rua")
    private String rua;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "data_nasc")
    private Date dataNascimento;

    @Column(name = "data_contratacao")
    private Date dataContratacao;

    @Column(name = "funcao")
    private String funcao;

}
