import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- SISTEMA PARA CÁLCULO DE REAJUSTE SALARIAL -----");

        System.out.println("Indique qual o salário atual do funcionário:");
        double salarioBase = entrada.nextDouble();
        double aumento = 0;
        double salarioReajustado = 0;

        if (salarioBase < 1201){
            aumento = salarioBase * 0.2;
            salarioReajustado = salarioBase * 1.2;
            System.out.printf("O salário base de %.2f, receberá um reajuste de 20%%, equivalente a R$ %.2f, totalizando R$ %.2f.", salarioBase, aumento, salarioReajustado);
        } else if (salarioBase > 1200 && salarioBase < 1701) {
            aumento = salarioBase * 0.15;
            salarioReajustado = salarioBase * 1.15;
            System.out.printf("O salário base de %.2f, receberá um reajuste de 15%%, equivalente a R$ %.2f, totalizando R$ %.2f.", salarioBase, aumento, salarioReajustado);
        }  else if (salarioBase > 1700 && salarioBase < 2501) {
            aumento = salarioBase * 0.1;
            salarioReajustado = salarioBase * 1.1;
            System.out.printf("O salário base de %.2f, receberá um reajuste de 10%%, equivalente a R$ %.2f, totalizando R$ %.2f.", salarioBase, aumento, salarioReajustado);
        } else {
            aumento = salarioBase * 0.05;
            salarioReajustado = salarioBase * 1.05;
            System.out.printf("O salário base de %.2f, receberá um reajuste de 5%%, equivalente a R$ %.2f, totalizando R$ %.2f.", salarioBase, aumento, salarioReajustado);
        }
    }
}
