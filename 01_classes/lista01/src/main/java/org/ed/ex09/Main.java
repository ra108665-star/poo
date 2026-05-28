package org.ed.ex09;

public class Main {
    static void main(String[] args) {
        Celular nokia = new Celular("nokia", "tx-440", 100);

        nokia.usar(101);
        nokia.carregar(150);
        int nivel = nokia.getNivelBateria();
        System.out.println("Nível da bateria: " + nivel);
    }
}
