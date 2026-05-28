package org.example.ex24;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Humano> humanos = new ArrayList<>();
        humanos.add(new Guerreiro("Javier", 900, "Chute"));
        humanos.add(new Mago("Iona", 300, "Fogo"));

        // Busca
        System.out.println("Digite o nome:");
        Scanner scan = new Scanner(System.in);
        String busca = scan.nextLine();

        Humano encontrado = (Humano) Humano.buscaNome(humanos, busca);

        // Remocao
        System.out.println("Digite o nome a ser removido:");
        String buscaRemove = scan.nextLine();

        humanos.remove(buscaRemove);

        // Display
        for (Humano humano: humanos){
            System.out.println(humano);
            System.out.println();
        }
    }
}
