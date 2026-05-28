package org.example.ex18;

public class Passaro extends Animal{
    private String cantar;

    public Passaro(String nome, String cantar) {
        super(nome);
        this.cantar = cantar;
    }

    public String getCantar() {
        return cantar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSom: " +cantar;
    }
}
