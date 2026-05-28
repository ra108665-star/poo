package org.example.ex16;

import java.util.ArrayList;

public class Main {
    static void main (){
        ArrayList<Funcionario> pessoas = new ArrayList<>();
        pessoas.add(new Gerente("Jonas", 3000.0f, 1));
        pessoas.add(new Vendedor("davi", 2000.0f, 100));

        for (Funcionario pessoa: pessoas) {
            System.out.println(pessoa);
            System.out.println();
        }

    }
}
