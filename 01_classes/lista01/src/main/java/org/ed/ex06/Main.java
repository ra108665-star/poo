package org.ed.ex06;

public class Main {
    static void main(String[] args) {
        Carro gol = new Carro();

        gol.setMarca("Volk");
        gol.setModelo("2001");
        gol.setVelocidade(0);

        gol.acelerar(30);
        gol.mostrarVelocidade();
        gol.frear(40);
        gol.acelerar(20);
        gol.mostrarVelocidade();
        gol.frear(50);
        gol.mostrarVelocidade();

    }
}
