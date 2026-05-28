package org.example.ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Edu", 25, "101", "CC"));
        alunos.add(new Aluno("Ari", 29, "102", "Inf"));

        for(Aluno aluno: alunos) {
            System.out.println(aluno);
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da matrícula: ");
        String busca = scan.nextLine();

        int i = 0;
        while(i < alunos.size() && !alunos.get(i).getMatricula().equals(busca)){
            i++;
        }
        if (i < alunos.size()) {
            System.out.println("Aluno removido:");
            System.out.println(alunos.get(i));
            alunos.remove(i);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
