package com.academiaApi.academia.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @ManyToOne
    private Aluno aluno;
    private String nivel;
    @OneToMany
    private List<Aluno> alunos;
    private String A;
    private String B;
    private String C;
    private String D;
}
