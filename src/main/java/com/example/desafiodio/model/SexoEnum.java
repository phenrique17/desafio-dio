package com.example.desafiodio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexoEnum {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    INTERSEXO("Intersexo"),
    NAO_DESEJA_DECLARAR("Não desejo declarar"),
    OUTRO("outro");

    private final String descricao;

}