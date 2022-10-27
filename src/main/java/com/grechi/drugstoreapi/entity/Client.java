package com.grechi.drugstoreapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Immutable
@Table(name = "cliente")
@Data
public class Client {

    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_generator")
    @SequenceGenerator(name = "client_generator", sequenceName = "idcliente_seq")
    private Integer idCliente;

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

}
