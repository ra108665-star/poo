package org.ed.ex03;

public class Motor {
    private String tipo;
    private int potencia;
    private int numeroSerie;

    public Motor(String tipo, int potencia, int numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void exibirMotor() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia + " cv");
        System.out.println("Número de série: " + numeroSerie);
    }

}
