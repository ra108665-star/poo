package org.example.ex03;

public abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirVeiculo() {
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " + modelo);
    }
}
