public class App {
    public static void main(String[] args) throws Exception {
        // <tipo> identificador = valor;
        /* <tipo> identificador = valor; */
        String nome = "Cesar";
        int idade = 30;
        double altura = 1.75;
        boolean estudante = true;
        char inicial = 'C';

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Inicial: " + inicial);
        // Estruturas de controle
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
    }
}
