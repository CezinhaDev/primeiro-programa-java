package br.com.cesarhenrique.relogio.cronemetro;

public class tabuada {
    public static void main(String[] args) {
        int numero = 5; // Número para o qual queremos calcular a tabuada
        System.out.println("Tabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
