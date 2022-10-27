package com.grechi.drugstoreapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Table(name = "farmaceutico")
@PrimaryKeyJoinColumn(name = "funcionario_inss")
@Data
public class Pharmaceutical extends Employee {

    @Column(name = "crf")
    private Integer crf;

}
