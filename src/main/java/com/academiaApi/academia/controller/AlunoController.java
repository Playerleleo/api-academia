package com.academiaApi.academia.controller;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;
import com.academiaApi.academia.model.Aluno;
import com.academiaApi.academia.repository.AlunoRepository;
import com.academiaApi.academia.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AlunoController {
final private AlunoService service;
final private AlunoRepository repository;

    public AlunoController(AlunoService alunoService, AlunoRepository repository, AlunoRepository repository1) {
        this.service = alunoService;
        this.repository = repository1;
    }
    @PostMapping("/aluno")
    public ResponseEntity<?> cadastrarAluno(@RequestBody AlunoInput alunoInput) {
        AlunoOutput alunoOutput = service.cadastrandoAluno(alunoInput);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoOutput);
    }

    @GetMapping("/getall")
    public List<Aluno> pegandoTodos() {
        return repository.findAll();
    }
}
