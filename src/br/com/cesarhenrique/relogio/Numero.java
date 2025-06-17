package br.com.cesarhenrique.relogio;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        System.out.println("Jogo do jogo do numero");
        System.out.println("----------------------------------------------");
        int numero = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par.");
        } else {
            System.out.println("O numero " + numero + " é impar.");
        }

    }
}
