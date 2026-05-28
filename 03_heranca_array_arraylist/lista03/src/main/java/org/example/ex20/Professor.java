package org.example.ex20;

public class Professor extends Pessoa{
    private float salario;

    public Professor(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário do professor: $" +salario;
    }
}
