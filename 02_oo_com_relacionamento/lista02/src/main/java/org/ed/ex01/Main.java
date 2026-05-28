package org.ed.ex01;

public class Main {
    static void main(String[] args) {
        CPF cpf = new CPF("123.456.789-0", "OK");
        Pessoa edu = new Pessoa("Edu", 25, cpf);

        edu.exibirDados();
    }
}
