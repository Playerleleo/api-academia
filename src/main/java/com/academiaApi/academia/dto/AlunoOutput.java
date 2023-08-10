package com.academiaApi.academia.dto;
import lombok.Data;

import java.time.LocalTime;



@Data
public class AlunoOutput {
    Long id;
    String nome;
    LocalTime horario;
    String telefone;
    String email;
}
