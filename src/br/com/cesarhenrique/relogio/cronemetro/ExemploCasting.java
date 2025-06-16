package br.com.cesarhenrique.relogio.cronemetro;

public class ExemploCasting {
    public static void main(String[] args) {
        double numeroDecimal = 8.1;
        int numeroInteiro;

        numeroInteiro = (int) numeroDecimal; // Casting explícito de double para int
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número inteiro após casting: " + numeroInteiro);
    }
}
