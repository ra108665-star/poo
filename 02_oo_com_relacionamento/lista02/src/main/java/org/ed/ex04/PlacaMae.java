package org.ed.ex04;

public class PlacaMae {
    private String modelo;
    private String chipset;

    public PlacaMae(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public void exibirDados() {
        System.out.println("Modelo da placa-mãe: " + modelo);
        System.out.println("Chipset: " + chipset);
    }
}
