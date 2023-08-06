package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Aluno;

import java.util.List;

public record TreinoInput(Aluno aluno, String nivel, List<Aluno> alunos, String treinoA, String treinoB,
                          String treinoC, String treino) {
}
