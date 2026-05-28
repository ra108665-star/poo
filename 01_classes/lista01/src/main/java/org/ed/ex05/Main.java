package org.ed.ex05;

public class Main {
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setSaldo(1000.00f);
        conta1.consultarSaldo();

        conta1.sacar(1000.01f);
        conta1.sacar(500.00f);
        conta1.consultarSaldo();
    }
}
