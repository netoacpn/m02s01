import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- CALCULADORA DE MÉDIA ACADÊMICA -----");
        System.out.println("Insira a nota nª 1 do semestre: ");
        double notaUm = entrada.nextDouble();
        System.out.println("Insira a nota nª 2 do semestre: ");
        double notaDois = entrada.nextDouble();
        System.out.println("Insira a nota nª 3 do semestre: ");
        double notaTres = entrada.nextDouble();

        double media = (notaUm + notaDois + notaTres)/3;

        System.out.printf("A média final do semestre é %.2f!", media);

    }
}
