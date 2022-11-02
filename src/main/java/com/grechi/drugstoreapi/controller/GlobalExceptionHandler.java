package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.dto.ResponseError;
import com.grechi.drugstoreapi.exception.ValidationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    protected ResponseEntity<ResponseError> handleValidationException(ValidationException ex, WebRequest request) {
        ResponseError responseError = new ResponseError(ex.getMessage());
        return new ResponseEntity<>(responseError, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
