package org.example.ex03;

public class Main {
    static void main(String[] args) {
        Carro saveiro = new Carro("Volks", "Saveiro", 2);
        saveiro.exibirCarro();

        Moto honda = new Moto("Honda", "Scooter", 50);
        honda.exibirMoto();
    }
}
