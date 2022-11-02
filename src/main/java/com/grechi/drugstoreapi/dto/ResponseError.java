package com.grechi.drugstoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseError {
    private String message;
}
