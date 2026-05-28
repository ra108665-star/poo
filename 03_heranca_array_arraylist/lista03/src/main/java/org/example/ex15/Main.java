package org.example.ex15;

import java.util.ArrayList;

public class Main {
    static void main() {
        Gerente[] gerentes = new Gerente[2];
        gerentes[0] = new Gerente("Adao", 1);
        gerentes[1] = new Gerente("Bela", 2);

        for (Gerente gerente: gerentes) {
            System.out.println(gerente);
            System.out.println();
        }

        ArrayList<Funcionario> estagiarios = new ArrayList<>();
        estagiarios.add(new Estagiario("Cacio", 1000.0f));
        estagiarios.add(new Estagiario("Dona", 4400.0f));
        for (Funcionario estagiario: estagiarios) {
            System.out.println(estagiario);
            System.out.println();
        }
    }
}
