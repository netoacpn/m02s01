import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 5) + 1;

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando:");
        int numeroIndicado = entrada.nextInt();

        if (numeroIndicado == numeroAleatorio){
            System.out.println("Você acertou!");
        } else {
            System.out.printf("Você errou! O númer correto era %d!%n", numeroAleatorio);
        }
    }
}
