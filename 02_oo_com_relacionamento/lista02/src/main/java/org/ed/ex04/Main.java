package org.ed.ex04;

public class Main {
    static void main(String[] args) {
        PlacaMae placamae = new PlacaMae("Intel", "Southbridge");
        Computador pc = new Computador("Intel", "i5", placamae);
        pc.exibirConfiguratcao();
    }
}
