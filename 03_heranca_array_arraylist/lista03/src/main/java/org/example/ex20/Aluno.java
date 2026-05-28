package org.example.ex20;

public class Aluno extends Pessoa{
    private int idade;

    public Aluno(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIdade: " +idade;
    }
}
