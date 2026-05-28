package org.ed.ex09;

public class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria;

    public Celular(String marca, String modelo, int nivelBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void carregar(int valor) {
        nivelBateria += valor;
        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
    }

    public void usar(int valor) {
        nivelBateria -= valor;
        if (nivelBateria < 0) {
            nivelBateria = 0;
        }
    }
}
