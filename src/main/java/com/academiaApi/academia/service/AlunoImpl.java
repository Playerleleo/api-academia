package com.academiaApi.academia.service;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;
import com.academiaApi.academia.model.Aluno;
import com.academiaApi.academia.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AlunoImpl implements AlunoService {
 final private AlunoRepository alunoRepository;

    public AlunoImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public AlunoOutput cadastrandoAluno(AlunoInput alunoInput) {
        Aluno entidadeAluno = pegaInputAluno(alunoInput);

        var saveDb = alunoRepository.save(entidadeAluno);

        AlunoOutput alunoOutput = respostaAluno(entidadeAluno);

        return alunoOutput;
    }

    @Override
    public List<AlunoOutput> getAll() {
        List<Aluno> alunos = alunoRepository.findAll();
        return  alunos.stream()
                .map(this::convertToAlunoOutput)
                .collect(Collectors.toList());
    }

    @Override
    public AlunoOutput convertToAlunoOutput(Aluno aluno) {
        AlunoOutput alunoOutput = new AlunoOutput();
        alunoOutput.setId(aluno.getId());
        alunoOutput.setNome(aluno.getNome());
        alunoOutput.setHorario(aluno.getHorario());
        alunoOutput.setTelefone(aluno.getTelefone());
        alunoOutput.setEmail(aluno.getEmail());
        return alunoOutput;
    }

    Aluno pegaInputAluno(AlunoInput alunoInput){
        var entidadeAluno = new Aluno();
        entidadeAluno.setNome(alunoInput.getNome());
        entidadeAluno.setHorario(alunoInput.getHorario());
        entidadeAluno.setTelefone(alunoInput.getTelefone());
        entidadeAluno.setEmail(alunoInput.getEmail());

        return entidadeAluno;
    }

    AlunoOutput respostaAluno(Aluno aluno){
        var resposta = new AlunoOutput();
        resposta.setId(aluno.getId());
        resposta.setNome(aluno.getNome());
        resposta.setHorario(aluno.getHorario());
        resposta.setTelefone(aluno.getTelefone());
        resposta.setEmail(aluno.getEmail());

        return resposta;
    }
}
