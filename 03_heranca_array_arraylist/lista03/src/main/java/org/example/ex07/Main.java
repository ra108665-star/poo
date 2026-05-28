package org.example.ex07;

public class Main {
    static void main (String[] args) {
        Carro carros[] = new Carro[4];

        carros[0] = new Carro("Volk", "Gol", 2);
        carros[1] = new Carro("Volk", "Saveiro", 2);
        carros[2] = new Carro("Peujeout", "206", 4);

        for (int i = 0; i < 3; i++) {
            carros[i].exibirCarro();
        }
    }
}
