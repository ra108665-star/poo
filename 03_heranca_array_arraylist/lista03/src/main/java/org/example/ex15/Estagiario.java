package org.example.ex15;

public class Estagiario extends Funcionario{
    private float salario;

    public Estagiario(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário: " +salario;
    }
}
