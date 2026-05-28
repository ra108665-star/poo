package org.ed.ex14;

public class Main {
    static void main(String[] args) {
        Contato aluno = new Contato("Foo", "998876655", "foo@msn.com");
        aluno.exibirContato();
        aluno.alterarTelefone("123456789");
        aluno.exibirContato();
    }
}
