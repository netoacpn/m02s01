import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- CÁLCULADORA DE P.A. OU P.G. (10 PRIMEIROS VALORES) -----");

        System.out.printf("Escolha a opção:%n a - Para calcular a progressão aritimética;%n b - Para progressão geométrica.%n");
        char escolha = entrada.next().charAt(0);

        switch (escolha){
            case 'a':
                System.out.println("Insira um valor inicial:");
                int valorInicial = entrada.nextInt();

                System.out.println("Insira um valor raiz:");
                int valorRaiz = entrada.nextInt();

                System.out.println(valorInicial);

                for (int i = 1; i < 10; i++){
                    valorInicial = valorInicial + valorRaiz;
                    System.out.println(valorInicial);
                }
                break;
            case 'b':
                System.out.println("Insira um valor inicial:");
                valorInicial = entrada.nextInt();

                System.out.println("Insira um valor raiz:");
                valorRaiz = entrada.nextInt();

                System.out.println(valorInicial);

                for (int i = 1; i < 10; i++){
                    valorInicial = valorInicial * valorRaiz;
                    System.out.println(valorInicial);
                }
                break;
            default:
                System.out.println("Opção inválida, execute novamente a aplicação.");
        }
    }
}
