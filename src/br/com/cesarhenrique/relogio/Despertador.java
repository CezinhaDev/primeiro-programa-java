package br.com.cesarhenrique.relogio;
public class Despertador {
    int horas;
    int minutos;
    int soneca;

    void ativarSoneca(){
        System.out.println("so mais " + soneca + " minutos :P");
    }

    String agendarAlarme() {
        String hora;
        String minuto;
        return "Seu alarme foi agendado para " + hora + ":" + minuto;
    }
}
