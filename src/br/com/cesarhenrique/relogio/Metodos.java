package br.com.cesarhenrique.relogio;

/*<tipo de retorno do metodo> identificador(<tipo> parametro){
 * retorna valor;
 * }
*/
public class Metodos {
    public static void main(String[] args) {
        ativarSoneca();
        agendarAlarme(7, 30);
        calculaSoma(5, 10);

    }

    /*
     * Sistema de declaração de métodos
     * 
     * <tipo de retorno do metodo> identificador(<tipo> parametro){ retorna valor;
     */

    static void ativarSoneca() {
        // Lógica para ativar a soneca
        System.out.println("Soneca ativada!");
        System.out.println("A soneca será ativada em 5 minutos.");
    }

    static String agendarAlarme(int hora, int minuto) {
        return " seu alarm foi agendado para " + hora + ":" + minuto;
    }

    static int calculaSoma(int a, int b) {
        int soma = a + b;
        if (a > b) {
            System.out.println("A soma é maior que b");
        } else {
            System.out.println("A soma é menor ou igual a b");
        }
        return soma;
    }
}