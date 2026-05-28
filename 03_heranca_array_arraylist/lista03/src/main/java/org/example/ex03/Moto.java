package org.example.ex03;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirMoto() {
        exibirVeiculo();
        System.out.println("Cilindradas: " +cilindradas);
    }
}
