package org.ed.ex04;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;

    public Computador(String marca, String processador, PlacaMae placaMae) {
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public void exibirConfiguratcao() {
        System.out.println("Marca do computador: " + marca);
        System.out.println("Processador: " + processador);
        placaMae.exibirDados();
    }
}
