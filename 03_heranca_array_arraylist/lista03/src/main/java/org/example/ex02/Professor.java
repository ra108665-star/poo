package org.example.ex02;

public class Professor extends Pessoa {
    private String disciplina;
    private float salario;

    public Professor(String nome, int idade, String disciplina, float salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibirProfessor() {
        exibirPessoa();
        System.out.println("Disciplina: " +disciplina);
        System.out.println("Salário: $" +salario);
    }
}
