package org.ed;

public class Sort {
    public void bubbleSort(Vetor vetor) {
        int[] v = vetor.getVetor();
        int aux;

        for (int i = 0; i < vetor.size() - 1; i++) {
            for (int j = 0; j < vetor.size() - 1 -i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}
