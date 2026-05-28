package org.ed.ex10;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public void exibirUsuario() {
        System.out.println("Login " + login);
        System.out.println("Email " + email);
        perfil.dados();
    }
}
