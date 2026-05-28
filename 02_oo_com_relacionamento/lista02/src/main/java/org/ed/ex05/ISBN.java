package org.ed.ex05;

public class ISBN {
    private int codigo;
    private String editora;

    public ISBN(int codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }

    public void exibirDados() {
        System.out.println("Código ISBN: " + codigo);
        System.out.println("Editora: " + editora);
    }
}
