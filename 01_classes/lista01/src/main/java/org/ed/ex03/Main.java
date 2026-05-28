package org.ed.ex03;

public class Main {
    static void main(String[] args) {

        Aluno ed = new Aluno();
        ed.setNome("Ed");
        ed.setMatricula(101);
        ed.setNota1(10.0f);
        ed.setNota2(2.0f);
        ed.verificarSituacao();

        Aluno edu = new Aluno();
        edu.setNome("Edu");
        edu.setMatricula(102);
        edu.setNota1(9.0f);
        edu.setNota2(5.0f);
        edu.verificarSituacao();
    }
}
