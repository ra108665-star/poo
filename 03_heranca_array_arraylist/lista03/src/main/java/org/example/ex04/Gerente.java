package org.example.ex04;

public class Gerente extends Funcionario{
    private int setor;

    public Gerente(String nome, float salario, int setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirGerente() {
        exibirFuncionario();
        System.out.println("Setor: " +setor);
    }
}
