package org.example.ex17;

public class ContatoProfissional extends Contato{
    private String number;

    public ContatoProfissional(String nome, String number) {
        super(nome);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNº profissional: " +number;
    }
}
