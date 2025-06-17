package br.com.cesarhenrique.relogio;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Seja bem vindo ao programa, compara numeros");
        System.out.println("----------------------------------------------");

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = leitura.nextInt();

        if(primeiroNumero == segundoNumero){
            System.out.println("Os dois numeros sao iguasis.");
        }else if(primeiroNumero > segundoNumero){
            System.out.println("O primeiro numero " + primeiroNumero + " é maior que o segundo numero " + segundoNumero);
        }else{
            System.out.println("O segundo numero " + segundoNumero + " é maior que o primeiro numero " + primeiroNumero);
        }
    }
}
