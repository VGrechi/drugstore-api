package com.grechi.drugstoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    protected Integer inss;
    protected String nome;
    protected String sexo;
    protected String cidade;
    protected String rua;
    protected Integer cep;
    protected String dataNascimento;
    protected String dataContratacao;
    protected String funcao;
    private Integer crf;

}
