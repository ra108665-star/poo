package org.ed.ex09;

public class Main {
    static void main(String[] args) {
        CNPJ cnpj = new CNPJ(123, "Ativo");
        Empresa catatu = new Empresa("Catatu LTDA", "Catatu", cnpj);

        catatu.exibirEmpresa();
    }
}
