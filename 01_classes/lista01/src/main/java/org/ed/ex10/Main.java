package org.ed.ex10;

public class Main {
    static void main(String[] args) {
        Filme bambi = new Filme("Bambi", "Infantil", 70, 10);

        bambi.exibirFichaTecnica();
        bambi.alterarAvaliacao(11);
        bambi.exibirFichaTecnica();
        bambi.alterarAvaliacao(5);
        bambi.exibirFichaTecnica();
        bambi.alterarAvaliacao(-1);
        bambi.exibirFichaTecnica();
    }
}
