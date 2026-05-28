package org.example.ex20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main () {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Jao", 18));
        pessoas.add(new Professor("Paulo", 3000.0f));
        pessoas.add(new Coordenador("Robert", "São Francisco"));

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
            System.out.println();
        }

        // Listagem por tipo
        for (Pessoa pessoa: pessoas) {
            if (pessoa instanceof Aluno) {
                System.out.println(pessoa);
            } else if (pessoa instanceof Professor) {
                System.out.println(pessoa);
            }
            else {System.out.println(pessoa);}
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome");
        String busca = scan.nextLine();

        boolean achou = false;

        int i = 0;
        while (i < pessoas.size() && !achou) {
            if (pessoas.get(i).getNome().equals(busca)) {
                achou = true;
                System.out.println("Pessoa encontrada: ");
                System.out.println(pessoas.get(i));
            }
            i++;
        }

        if(!achou) {
            System.out.println(busca + " não foi encontrada(o).");
        }
    }
}
