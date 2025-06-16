package br.com.cesarhenrique.relogio.cronemetro;

public class ContadorDeDesconto {
    public static void main(String[] args) {
      double precoOriginal = 150.00;
      double desconto = 10.0; // 10% de desconto
      double valorDoDesconto = (precoOriginal * desconto) / 100;
      double precoComDesconto = precoOriginal - valorDoDesconto;
      System.out.printf("O preço original é: R$ %.2f%n", precoOriginal);
      System.out.printf("O preço com desconto é: R$ %.2f%n", precoComDesconto);
    }
}
