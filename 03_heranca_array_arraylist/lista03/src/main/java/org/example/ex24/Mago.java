package org.example.ex24;

public class Mago extends Humano{
    private String magia;

    public Mago(String nome, int vida, String magia){
        super(nome, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMagia: " +magia;
    }
}
