package org.ed.ex06;

public class Cracha {
    private int codigo;
    private String dataValidade;

    public Cracha(int codigo, String dataValidade) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    public void exibirDados() {
        System.out.println("Código do cracha: " + codigo);
        System.out.println("Data de validade: " + dataValidade);
    }
}
