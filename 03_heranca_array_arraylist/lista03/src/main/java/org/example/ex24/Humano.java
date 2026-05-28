package org.example.ex24;

import java.util.ArrayList;

public abstract class Humano {
    private String nome;
    private int vida;

    public Humano(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public static Object buscaNome (ArrayList<Humano> humanos, String nome) {
        for (Humano humano: humanos) {
            if (humano.getNome().equals(nome)){
                return humano;
            }
        }
        return null;
    }

    public static void removeNome (ArrayList<Humano> humanos, String nome) {
        Humano encontrado = (Humano) buscaNome(humanos, nome);

        if (encontrado != null){
            humanos.remove(encontrado);
            return;
        }
        return;
    }

    @Override
    public String toString() {
        return "Nome: " +nome +
                "\nVida: " +vida +" HP";
    }
}
