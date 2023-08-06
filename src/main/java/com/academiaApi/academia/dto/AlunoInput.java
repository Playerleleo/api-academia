package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Plano;
import com.academiaApi.academia.model.Treino;

import java.time.LocalTime;

public record AlunoInput(String nome, Plano plano, Treino treino, LocalTime horario,
                         Boolean ativo, String telefone, String email) {
}
