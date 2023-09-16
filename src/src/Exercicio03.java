import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- VERIFICAÇÃO DE NÚMERO PAR OU ÍMPAR -----");

        int numero = 0;
        boolean entradaValida = false;

        while(!entradaValida){
            System.out.println("Por favor, digite um número inteiro:");
            if(entrada.hasNextInt()){
                numero = entrada.nextInt();
                entradaValida = true;
            }else {
                System.out.println("Este número não é válido!");
                entrada.nextLine();
            }
        }

        if(numero%2 == 0){
            System.out.println("O número inserido é par!");
        } else {
            System.out.println("O número inserido é ímpar!");
        }
    }
}
