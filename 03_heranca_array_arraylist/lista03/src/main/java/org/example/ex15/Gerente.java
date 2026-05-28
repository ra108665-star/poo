package org.example.ex15;

public class Gerente extends Funcionario{
    private int setor;

    public Gerente(String nome, int setor) {
        super(nome);
        this.setor = setor;
    }

    public int getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSetor: " +setor;
    }
}
