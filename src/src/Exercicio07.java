import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- SISTEMA PARA CÁLCULOS BÁSICOS -----");
        System.out.printf("O que você pretende fazer? Digite: %n a - para somar;%n b - para subtrair;%n c - para multiplicar;%n d - para diidir.%n");

        char escolha = entrada.next().charAt(0);

        System.out.println("Digite o número para ser somado, subtraído, multiplicado ou dividido:");
        double numeroUm = entrada.nextDouble();

        System.out.println("Digite o número para somar, subtrair, multiplicar ou dividir:");
        double numeroDois = entrada.nextDouble();

        switch (escolha){
            case 'a':
                double soma = numeroUm + numeroDois;
                System.out.printf("O resultado da soma dos números %f e %f, é: %f", numeroUm, numeroDois, soma);
                break;
            case 'b':
                double subtrai = numeroUm - numeroDois;
                System.out.printf("O resultado da subtração dos números %f e %f, é: %f", numeroUm, numeroDois, subtrai);
                break;
            case 'c':
                double multiplica = numeroUm * numeroDois;
                System.out.printf("O resultado da multiplicação dos números %f e %f, é: %f", numeroUm, numeroDois, multiplica);
                break;
            case 'd':
                double divide = numeroUm / numeroDois;
                System.out.printf("O resultado da divisão dos números %f e %f, é: %f", numeroUm, numeroDois, divide);
                break;
            default:
                System.out.println("Você inseriu uma opção inválida. Execute a aplicação novamente.");
        }
    }
}
