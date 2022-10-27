package com.grechi.drugstoreapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "produto")
@Data
public class Product {

    @Id
    @Column(name = "cod_produto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codProduto;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quant_estoque")
    private Integer qtdEstoque;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;

    @Column(name = "unidade")
    private String unidade;

    @Column(name = "tipo")
    private String tipo;

}
