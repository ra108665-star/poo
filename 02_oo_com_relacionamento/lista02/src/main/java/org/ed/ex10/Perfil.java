package org.ed.ex10;

public class Perfil {
    private String bio;
    private String foto;
    private String visibilidade;

    public Perfil(String bio, String foto, String visibilidade) {
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    public void dados() {
        System.out.println("Bio: " + bio);
        System.out.println("Foto: " + foto);
        System.out.println("Visibilidade: " + visibilidade);
    }
}
