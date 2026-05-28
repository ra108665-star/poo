package org.ed.ex10;

public class Main {
    static void main(String[] args) {
        Perfil profile = new Perfil("Vazio", "windows", "baixa");
        Usuario edu = new Usuario("edu2025", "edu@msn.com", profile);

        edu.exibirUsuario();
    }
}
