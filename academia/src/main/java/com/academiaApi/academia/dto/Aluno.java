package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Plano;
import com.academiaApi.academia.model.Treino;

import java.time.LocalTime;
import java.util.UUID;

public record Aluno(UUID id,String nome,Plano plano,Treino treino,LocalTime horario,
                    Boolean ativo,String telefone,String email) {

}
