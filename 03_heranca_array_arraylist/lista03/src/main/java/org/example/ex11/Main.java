package org.example.ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Professor> professores = new ArrayList<>();

        professores.add(new Professor("Ana", 24, "Io", 4000.0f));
        professores.add(new Professor("Beto", 35, "Ef", 5000.0f));
        professores.add(new Professor("Cati", 49, "Hist", 2222.2f));

        for (Professor professor : professores) {
            System.out.println(professor);
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String busca = scan.nextLine();

        int i = 0;
        while (i <= 2 && !professores.get(i).getNome().equals(busca)) {
            i++;
        }

        if (i < professores.size()) {
            System.out.println("Professor encontrado:");
            System.out.println(professores.get(i));
        } else {
            System.out.println("Professor não encontrado.");
        }
    }
}
