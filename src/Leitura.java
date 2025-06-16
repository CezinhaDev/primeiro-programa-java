import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual  ano de lancamento do filme? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliaçao do filme: ");
        double avaliaçao = leitura.nextDouble();
        System.out.println("O ano de lancamento do filme " + filme + " foi lancado em " + anoDeLancamento + " com a avaliaçao " + avaliaçao + " estrelas.");
    }
}