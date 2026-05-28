package org.ed.ex02;

public class Aluno {
    private String nome;
    private String curso;
    private Carterinha carterinha;

    public Aluno(String nome, String curso, Carterinha carterinha) {
        this.nome = nome;
        this.curso = curso;
        this.carterinha = carterinha;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
    public Carterinha getCarterinha() {
        return carterinha;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        carterinha.exibirDados();
    }
}
