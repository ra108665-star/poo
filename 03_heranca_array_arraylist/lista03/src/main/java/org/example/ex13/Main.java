package org.example.ex13;

import java.util.ArrayList;

public class Main {
    static void main() {
        Aluno[] alunos = new Aluno[2];

        alunos[0] = new Aluno("Pepe", 19, "101232", "Agronomia");
        alunos[1] = new Aluno("Jo", 29, "23132", "Adm");

        for (Aluno aluno: alunos) {
            System.out.println(aluno);
            System.out.println();
        }

        ArrayList<Professor> professores = new ArrayList<>();

        professores.add(new Professor("Ana", 24, "Io", 4000.0f));
        professores.add(new Professor("Beto", 35, "Ef", 5000.0f));

        for (Professor professor: professores) {
            System.out.println(professor);
            System.out.println();
        }
    }
}
