package org.example.ex05;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }

        int soma = 0;
        System.out.println("Valores digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            soma += array[i];

        }
        System.out.println("Soma: " +soma);
    }
}
