package org.example.ex21;

public class ProdutoFisico extends Produto{
    private int quantidade;

    public ProdutoFisico(String nome, float preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQuantidade de produtos físicos: " +quantidade;
    }
}
