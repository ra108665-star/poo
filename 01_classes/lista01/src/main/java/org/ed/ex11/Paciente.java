package org.ed.ex11;

public class Paciente {
    private String nome;
    private float peso;
    private float altura;

    public Paciente(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float calcularIMC() {
        return peso / (altura * altura);
    }

    public void classificarIMC() {
        float imc = calcularIMC();
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade leve");
        } else if (imc < 40) {
            System.out.println("Obesidade moderada");
        } else {
            System.out.println("Obesidade grave");
        }
    }
}
