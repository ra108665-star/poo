package org.ed.ex01;

public class CPF {
    private String numero;
    private String situacao;

    public CPF(String numero, String situacao) {
        this.numero = numero;
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void exibirDados() {
        System.out.println("CPF: " + numero);
        System.out.println("Situação: " + situacao);
    }

}
