package org.example.ex18;

public class Gato extends Animal{
    private String miar;

    public Gato(String nome, String miar) {
        super(nome);
        this.miar = miar;
    }

    public String getMiar() {
        return miar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMiado: " +miar;
    }
}
