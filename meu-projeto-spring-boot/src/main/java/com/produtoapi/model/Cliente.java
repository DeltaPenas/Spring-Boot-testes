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
public class Cliente {

    @Id
    @GeneratedValue
    private long id;

    @NotEmpty(message = "informe um nome.")
    private String nome;
    private long cpf;
    private String telefone;

    public Cliente(String nome, long cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }
    public Cliente(){
        //construtor vazio
    }
}
