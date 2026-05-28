package org.ed.ex09;

public class CNPJ {
    private int numero;
    private String situacaoCadastral;

    public CNPJ(int numero, String situacaoCadastral) {
        this.numero = numero;
        this.situacaoCadastral = situacaoCadastral;
    }

    public void dados() {
        System.out.println("Número cnpj: " + numero);
        System.out.println("Situação cadastral: "+ situacaoCadastral);
    }
}
