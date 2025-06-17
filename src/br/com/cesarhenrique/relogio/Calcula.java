package br.com.cesarhenrique.relogio;

import java.util.Scanner;

public class Calcula {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo ao programa de calculo ");
        System.out.println("----------------------------------------------");

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        System.out.print("Escolha uma opção (1 ou 2): ");

        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
