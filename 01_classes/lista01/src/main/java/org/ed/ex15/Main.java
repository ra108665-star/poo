package org.ed.ex15;

public class Main {
    static void main(String[] args) {
        LivroBiblioteca calculo = new LivroBiblioteca("Cálculo", "Steve", 123, true);
        calculo.emprestar();
        calculo.exibirInformacoes();
        calculo.emprestar();
        calculo.devolver();
        calculo.exibirInformacoes();
    }
}
