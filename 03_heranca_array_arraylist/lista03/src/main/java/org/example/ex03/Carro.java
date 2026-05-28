package org.example.ex03;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas =quantidadePortas;
    }

    public void exibirCarro(){
        exibirVeiculo();
        System.out.println("Nº portas: " +quantidadePortas);
    }
}
