package org.ed.ex06;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    public void exibirFuncionario(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        cracha.exibirDados();
    }
}
