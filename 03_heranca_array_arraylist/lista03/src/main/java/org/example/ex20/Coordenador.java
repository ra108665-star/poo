package org.example.ex20;

public class Coordenador extends Pessoa{
    private String escola;

    public Coordenador(String nome, String  escola) {
        super(nome);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEscola do coordenador: " +escola;
    }
}
