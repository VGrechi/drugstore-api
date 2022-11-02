package com.grechi.drugstoreapi.controller.validator;

import com.grechi.drugstoreapi.dto.ResponseError;
import com.grechi.drugstoreapi.entity.Client;
import com.grechi.drugstoreapi.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Objects;

public class ClientValidator {

    public static void validate(Client client) throws ValidationException {
        if(Objects.isNull(client.getNome()) || client.getNome().isEmpty()){
            throw new ValidationException("Nome não pode ser nulo ou vazio.");
        }

        if(Objects.isNull(client.getSexo()) || client.getSexo().isEmpty()){
            throw new ValidationException("Gênero (sexo biológico) não pode ser nulo ou vazio.");
        }

        String[] validGenders = {"F", "M"};
        if(Arrays.stream(validGenders).noneMatch(g -> g.equals(client.getSexo()))){
            throw new ValidationException("Gênero (sexo biológico) inválido.");
        }

        if(Objects.isNull(client.getCidade()) || client.getCidade().isEmpty()){
            throw new ValidationException("Cidade não pode ser nulo ou vazio.");
        }

        if(Objects.isNull(client.getRua()) || client.getRua().isEmpty()){
            throw new ValidationException("Rua não pode ser nulo ou vazio.");
        }

        if(Objects.isNull(client.getCep())){
            throw new ValidationException("CEP não pode ser nulo ou vazio.");
        }

        if(Objects.isNull(client.getDataNascimento())){
            throw new ValidationException("Data de Nascimento não pode ser nulo ou vazio.");
        }

        /*

      |            | Data de Nascimento não pode ser nulo ou vazio.      |
      | 32/03/1994 | Data de Nascimento inválida.                        |
     */
    }
}
