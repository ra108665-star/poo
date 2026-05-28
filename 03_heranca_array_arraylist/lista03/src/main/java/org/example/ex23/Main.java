package org.example.ex23;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Digite 5 números inteiros: ");
        for (int i = 0; i < 5; i++) {
            lista.add(scan.nextInt());
        }

        int soma = 0;
        System.out.println("Valores digitados: ");
        for (Integer elem: lista) {
            System.out.println(elem);
            soma += elem;
        }
        System.out.println("Soma: " +soma);
    }
}
