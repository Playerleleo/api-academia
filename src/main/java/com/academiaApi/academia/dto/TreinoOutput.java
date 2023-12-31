package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Aluno;
import java.util.List;
import java.util.UUID;

public record TreinoOutput(UUID id,Aluno aluno, String nivel,List<Aluno> alunos,String treinoA,String treinoB,
                     String treinoC, String treino) {
}
