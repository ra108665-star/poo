package org.ed.ex06;

public class Main {
    static void main(String[] args) {
        Cracha c1 = new Cracha(1, "03/04/26");
        Funcionario nando = new Funcionario("Nando", "faxineiro", c1);
        nando.exibirFuncionario();

        Cracha c2 = new Cracha(2, "01/01/25");
        Funcionario ana = new Funcionario("Ana", "cozinheira", c2);
        ana.exibirFuncionario();
    }
}
