package org.ed;

public class Vetor {
    private int[] vetor;

    public Vetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }
    public int size() {
        return vetor.length;
    }

    public void exibeVetor() {
        System.out.println("Vetor ordenado");
        for (int i = 0; i < size(); i++) {
            System.out.println(vetor[i]);
        }
        System.out.println();
    }
}
