package com.academiaApi.academia.dto;

import com.academiaApi.academia.model.Plano;
import com.academiaApi.academia.model.Treino;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Data
@Setter
@Getter
public record AlunoInput(String nome, Plano plano, Treino treino, LocalTime horario,
                         Boolean ativo, String telefone, String email) {
}
