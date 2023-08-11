package com.academiaApi.academia.controller;

import com.academiaApi.academia.dto.AlunoInput;
import com.academiaApi.academia.dto.AlunoOutput;
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

    public AlunoController(AlunoService alunoService, AlunoRepository repository) {
        this.service = alunoService;
    }
    @PostMapping("/aluno")
    public ResponseEntity<?> cadastrarAluno(@RequestBody AlunoInput alunoInput) {
        AlunoOutput alunoOutput = service.cadastrandoAluno(alunoInput);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoOutput);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> pegandoTodos() {
        List<AlunoOutput> alunoOutput = service.getAll();
        return ResponseEntity.ok(alunoOutput);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        AlunoOutput alunoOutput = service.getForId(id);
        return ResponseEntity.ok(alunoOutput);
    }
}
