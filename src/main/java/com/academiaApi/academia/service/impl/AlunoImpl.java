package com.academiaApi.academia.service.impl;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;
import com.academiaApi.academia.model.Aluno;
import com.academiaApi.academia.repository.AlunoRepository;
import com.academiaApi.academia.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoImpl implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public AlunoOutput cadastrandoAluno(AlunoInput alunoInput) {
        pegaInputAluno(alunoInput);


        return null;
    }
    AlunoInput pegaInputAluno(AlunoInput alunoInput){
        alunoInput.setNome(alunoInput.getNome());
        alunoInput.setPlano(alunoInput.getPlano());
        alunoInput.setTreino(alunoInput.getTreino());
        alunoInput.setHorario(alunoInput.getHorario());
        alunoInput.setAtivo(alunoInput.getAtivo());
        alunoInput.setTelefone(alunoInput.getTelefone());
        alunoInput.setEmail(alunoInput.getEmail());
        return alunoInput;
    }

    AlunoOutput respostaAluno(Aluno aluno){
        var resposta = new AlunoOutput();
        resposta.setId(aluno.getId());
        resposta.setNome(aluno.getNome());
        resposta.setPlano(aluno.getPlano());
        resposta.setTreino(aluno.getTreino());
        resposta.setHorario(aluno.getHorario());
        resposta.setAtivo(aluno.getAtivo());
        resposta.setTelefone(aluno.getTelefone());
        resposta.setEmail(aluno.getEmail());

        return resposta;
    }
}
