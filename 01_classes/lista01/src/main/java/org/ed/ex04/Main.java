package org.ed.ex04;

public class Main {
    static void main(String[] args) {
        Retangulo ret = new Retangulo();

        ret.setAltura(4);
        ret.setBase(5);

        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}
