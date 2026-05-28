package org.example.ex11;

public class Professor extends Pessoa {
    private String disciplina;
    private float salario;

    public Professor(String nome, int idade, String disciplina, float salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDisciplina: " + disciplina +
                "\nSalário: $" + salario;
    }
}

