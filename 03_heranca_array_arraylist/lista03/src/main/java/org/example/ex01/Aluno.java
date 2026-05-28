package org.example.ex01;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade,
                 int matricula, String curso) {

        super(nome, idade);

        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirAluno() {
        exibirPessoa();

        System.out.println("Matrícula: " +matricula);
        System.out.println("Curso: " +curso);
    }
}
