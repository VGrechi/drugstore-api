package com.grechi.drugstoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureDTO {

    private Integer idCliente;
    private Integer inss;
    private String tipo;
    private List<ProductDTO> produtos;

}
