package com.ed.restaurante_bd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    private int id;

    private String nome;

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}