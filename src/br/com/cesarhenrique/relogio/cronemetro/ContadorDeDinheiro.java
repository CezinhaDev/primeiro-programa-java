package br.com.cesarhenrique.relogio.cronemetro;

public class ContadorDeDinheiro {
    public static void main(String[] args) {
       double valorEmDolar = 100.50;
       double valorEmReal = valorEmDolar * 5.53;
       System.out.printf("O valor em real é: R$ %.2f%n", valorEmReal);
       System.out.printf("O valor em dolar é: $%.2f%n", valorEmDolar);
    }
}
