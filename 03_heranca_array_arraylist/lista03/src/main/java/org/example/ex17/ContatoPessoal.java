package org.example.ex17;

public class ContatoPessoal extends Contato{
    private String number;

    public ContatoPessoal(String nome, String number) {
        super(nome);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNº pessoal: " + number;
    }
}
