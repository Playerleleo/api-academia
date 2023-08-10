package com.academiaApi.academia.dto;


import lombok.Data;

import java.time.LocalTime;
@Data
public class AlunoInput {
    String nome;
    LocalTime horario;
    String telefone;
    String email;
}
