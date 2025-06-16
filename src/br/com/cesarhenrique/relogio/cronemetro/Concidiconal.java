package br.com.cesarhenrique.relogio.cronemetro;

public class Concidiconal {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamento que eles estao curtindo!");
        } else {
            System.out.println("Lancamento que eles nao estao curtindo!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Premium")) {
            System.out.println("Filme incluido no plano!");
        } else {
            System.out.println("Filme nao incluido no plano!");
        }
    }
}
