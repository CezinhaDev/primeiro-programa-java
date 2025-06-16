package br.com.cesarhenrique.relogio.cronemetro;

public class Estoque {
    public static void main (String[] args) {
        double precoProduto = 19.00;
        int quantidadeEstoque = 100;
        double valorTotal = precoProduto * quantidadeEstoque;
        String mensagem = String.format("O valor total do estoque é: R$ %.2f", valorTotal);
        System.out.println(mensagem);
    }
}
