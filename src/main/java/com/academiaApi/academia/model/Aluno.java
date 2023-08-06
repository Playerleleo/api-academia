package com.academiaApi.academia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String nome;
    @ManyToOne
    private Plano plano;
    @ManyToOne
    private Treino treino;
    private LocalTime horario;
    private Boolean ativo;
    private String telefone;
    private String email;
}
