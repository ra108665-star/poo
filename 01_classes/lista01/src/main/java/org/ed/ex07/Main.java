package org.ed.ex07;

public class Main {
    static void main(String[] args) {
        Funcionario tito = new Funcionario();

        tito.setNome("Tito");
        tito.setCargo("Gerente");
        tito.setSalario(3000.00f);

        tito.aumentarSalario(10.0f);
        tito.exibirFuncionario();
    }
}
