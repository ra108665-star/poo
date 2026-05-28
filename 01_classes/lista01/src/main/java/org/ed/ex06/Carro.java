package org.ed.ex06;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int x) {
        velocidade += x;
    }

    public void frear(int y) {
        if (y <= velocidade) {
            velocidade -= y;
        } else {
            System.out.println("Velocidade inválida");
        }
    }

    public void mostrarVelocidade() {
        System.out.print("Velocidade: " + velocidade);
    }
}
