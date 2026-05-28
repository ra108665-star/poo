package org.example.ex08;

public class Main {
    static void main(String[] args) {
        Aluno alunos[] = new Aluno[2];
        alunos[0] = new Aluno("Pepe", 19, 101232, "Agronomia");
        alunos[1] = new Aluno("Jo", 29, 23132, "Adm");

        Professor professores[] = new Professor[2];
        professores[0] = new Professor("Tata", 40, "História",  5000.0f);
        professores[1] = new Professor("Gelim", 22, "Geografia", 3000.0f);

        for (int i = 0; i < 2; i++) {
            alunos[i].exibirAluno();
            professores[i].exibirProfessor();
        }
    }
}
