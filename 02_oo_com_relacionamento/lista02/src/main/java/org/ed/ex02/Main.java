package org.ed.ex02;

public class Main {
    static void main(String[] args) {
        Carterinha carterinha = new Carterinha(123, "01/02/2025");
        Aluno tomas = new Aluno("Tomas", "Informática", carterinha);
        tomas.exibirDados();
    }
}
