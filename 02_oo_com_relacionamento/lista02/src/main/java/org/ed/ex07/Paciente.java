package org.ed.ex07;

public class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    public Paciente(String nome, int idade, Prontuario prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public void exibirPaciente() {
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Idade: " + idade);
        prontuario.dados();
    }

}
