package org.example.ex18;

public class Cachorro extends Animal{
    private String latir;

    public Cachorro(String nome, String latir) {
        super(nome);
        this.latir = latir;
    }

    public String getLatir() {
        return latir;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLatido: " +latir;
    }
}
