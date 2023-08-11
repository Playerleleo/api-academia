package com.academiaApi.academia.service;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;
import com.academiaApi.academia.model.Aluno;

import java.util.List;


public interface AlunoService {
    AlunoOutput cadastrandoAluno(AlunoInput alunoInput);

    List<AlunoOutput> getAll();

    AlunoOutput convertToAlunoOutput(Aluno aluno);

    AlunoOutput getForId(Long id);
}
