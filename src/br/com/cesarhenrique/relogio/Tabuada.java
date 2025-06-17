package br.com.cesarhenrique.relogio;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao programa de tabuada");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }
    }
}
