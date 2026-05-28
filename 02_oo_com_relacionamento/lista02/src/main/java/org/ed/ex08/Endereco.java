package org.ed.ex08;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void  dados() {
        System.out.println("Rua " + rua);
        System.out.println("Número " + numero);
        System.out.println("Bairro " + bairro);
        System.out.println("Cidade " + cidade);
    }
}
