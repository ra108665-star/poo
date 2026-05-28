package org.example.ex21;

public class ProdutoDigital extends Produto{
    private int tamanho;

    public ProdutoDigital(String nome, float preco, int tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTamanho(MB): " + tamanho;
    }
}
