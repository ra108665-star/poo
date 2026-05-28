package org.ed.ex07;

public class Prontuario {
    private int numeroRegistro;
    private String tipoSanguineo;
    private String alergias;

    public Prontuario(int numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

    public void dados() {
        System.out.println("Número de registro: " + numeroRegistro);
        System.out.println("Tipo sanguíneo: " + tipoSanguineo);
        System.out.println("Alerias: " + alergias);
    }
}
