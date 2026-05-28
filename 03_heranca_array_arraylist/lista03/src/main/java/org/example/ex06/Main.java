package org.example.ex06;

public class Main {
    static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];

        alunos[0] = new Aluno("Pepe", 19, 101232, "Agronomia");
        alunos[1] = new Aluno("Jo", 29, 23132, "Adm");
        alunos[2] = new Aluno("Mari", 22, 21321, "Bqi");

        for (int i = 0; i < 3; i++) {
            alunos[i].exibirAluno();
        }

    }
}

