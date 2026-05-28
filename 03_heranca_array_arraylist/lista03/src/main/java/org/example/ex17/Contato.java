package org.example.ex17;

public abstract  class Contato {
    private String nome;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " +nome;
    }
}
