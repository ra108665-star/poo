package org.example.ex18;

import java.util.ArrayList;

public class Main {
    static void main() {
        Animal[] animals = new Animal[2];

        animals[0] = new Cachorro("Tete", "wauwau");
        animals[1] = new Gato("Toshi", "miau");

        for (Animal animal: animals) {
            System.out.println(animal);
            System.out.println();
        }

        ArrayList<Animal> bichos = new ArrayList<>();

        bichos.add(new Passaro("galinha", "pocopoco"));
        bichos.add(new Passaro("bem-te-vi", "bem-te-vi"));

        for (Animal bicho: bichos) {
            System.out.println(bicho);
            System.out.println();
        }
    }
}
