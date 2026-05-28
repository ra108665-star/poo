package org.ed.ex13;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome () {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void adicionarPontos(int valor) {
        pontuacao += valor;
    }

    public void subirNivel() {
        while (pontuacao >= 100) {
            pontuacao -= 100;
            nivel++;
        }
        System.out.println("Nível: " + nivel);
    }
}
