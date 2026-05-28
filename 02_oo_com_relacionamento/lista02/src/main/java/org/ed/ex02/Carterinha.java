package org.ed.ex02;

public class Carterinha {
    private int numero;
    private String dataEmissao;

    public Carterinha(int numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    public int getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void exibirDados() {
        System.out.println("Número: " + numero);
        System.out.println("Data de emissão: " + dataEmissao);
    }

}
