package org.ed.ex02;

public class Main {
    public static void main(String[] args) {
        Produto vaca = new Produto();
        Produto camelo = new Produto();

        vaca.setNome("Vaca");
        vaca.setPreco(100.00f);

        camelo.setNome("Camelo");
        camelo.setPreco(150.00f);

        vaca.mostrarInformacoes();
        camelo.mostrarInformacoes();
    }
}
