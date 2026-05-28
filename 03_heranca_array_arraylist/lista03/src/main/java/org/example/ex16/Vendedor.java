package org.example.ex16;

public class Vendedor extends Funcionario{
    private int numeroVendas;

    public Vendedor(String nome, float salario, int numeroVendas)
    {
        super(nome, salario);
        this.numeroVendas = numeroVendas;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de vendas: " +numeroVendas;
    }
}
