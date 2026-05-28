package org.ed.ex05;

public class ContaBancaria {
    private int numero;
    private String titular;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setString(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
