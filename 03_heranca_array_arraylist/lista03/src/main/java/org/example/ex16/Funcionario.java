package org.example.ex16;

public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " +nome +
                "\nSalário: " +salario;
    }
}
