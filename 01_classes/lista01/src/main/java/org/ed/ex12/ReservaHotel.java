package org.ed.ex12;

public class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private float valorDiaria;

    public ReservaHotel (String nomeHospede, int quantidadeDiarias, float valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.quantidadeDiarias = quantidadeDiarias;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }
    public int getQuantidadeDiarias() {
        return  quantidadeDiarias;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public float calcularTotal() {
        return quantidadeDiarias * valorDiaria;
    }

    public void exibirReserva() {
        System.out.println("Hóspede: " + nomeHospede);
        System.out.println("Nº diárias: " + quantidadeDiarias);
        System.out.println("Valor/diária: $" + valorDiaria);
        System.out.println("Valor total: $" + calcularTotal());
    }
}

