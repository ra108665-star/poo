package org.example.ex24;

public class Guerreiro extends Humano{
    private String ataque;

    public Guerreiro(String nome, int vida, String ataque) {
        super(nome, vida);
        this.ataque = ataque;
    }

    public String getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAtaque: " +ataque;
    }
}
