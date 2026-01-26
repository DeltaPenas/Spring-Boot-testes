package com.produtoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Produto {
    @Id
    @GeneratedValue
    private long id;

    @NotEmpty(message = "Informe um nome.")
    private String nome;
    private int quantidade;
    private double valor;
    private String status;


    public Produto(String nome, int quantidade, double valor, String status){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.status = status;

    }

    public Produto(){
        //construtor vazio
    }

}
