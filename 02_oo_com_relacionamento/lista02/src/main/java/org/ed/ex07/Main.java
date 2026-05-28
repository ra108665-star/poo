package org.ed.ex07;

public class Main {
    static void main(String [] args) {
        Prontuario p1 = new Prontuario(101, "AB", "nenhuma");
        Paciente carlos = new Paciente("Carlos", 20, p1);

        carlos.exibirPaciente();
    }
}
