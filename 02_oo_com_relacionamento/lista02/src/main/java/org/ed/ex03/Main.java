package org.ed.ex03;

public class Main {
    static void main(String[] args) {
        Motor motor = new Motor("v6", 300, 1234);
        Carro corsa = new Carro("Chevrolet", "corsa", motor);

        corsa.ligarCarro();
        corsa.exibirFichaTecnica();
    }
}
