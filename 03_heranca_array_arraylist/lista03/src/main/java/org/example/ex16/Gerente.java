package org.example.ex16;

public class Gerente extends Funcionario {
    private int setor;

    public Gerente(String nome, float salario, int setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public int getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSetor do gerente: " +setor;
    }
}
