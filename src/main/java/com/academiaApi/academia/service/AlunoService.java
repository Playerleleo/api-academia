package com.academiaApi.academia.service;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;

public interface AlunoService {
    AlunoOutput cadastrandoAluno(AlunoInput alunoInput);
}
