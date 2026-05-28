package org.ed;

import java.util.Scanner;

public class Main {
    static void main () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int n = scan.nextInt();
        int [] vet = new int[n];

        System.out.println("Digite os elementos do vetor");
        for (int i = 0; i < n; i++) {
            vet[i] = scan.nextInt();
        }

        Vetor vetor = new Vetor(vet);
        Sort ordena = new Sort();
        ordena.bubbleSort(vetor);

        vetor.exibeVetor();

    }
}
