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
        var entidadeAluno = new Aluno();
        pegaInputAluno(alunoInput);
        var savedEntity = alunoRepository.save(entidadeAluno);
        return  respostaAluno(savedEntity);
    }

    AlunoInput pegaInputAluno(AlunoInput alunoInput){
        var entidadeAluno = new Aluno();
        entidadeAluno.setNome(alunoInput.getNome());
        entidadeAluno.setPlano(alunoInput.getPlano());
        entidadeAluno.setTreino(alunoInput.getTreino());
        entidadeAluno.setHorario(alunoInput.getHorario());
        entidadeAluno.setAtivo(alunoInput.getAtivo());
        entidadeAluno.setTelefone(alunoInput.getTelefone());
        entidadeAluno.setEmail(alunoInput.getEmail());
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
