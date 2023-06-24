package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Aluno;
import java.util.List;
import java.util.UUID;

public record Treino(UUID id,Aluno aluno, String nivel,List<Aluno> alunos,String A,String B,
                     String C, String D) {
}
