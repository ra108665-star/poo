package org.example.ex04;

public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " +nome);
        System.out.println("Salário: " +salario);
    }
}
