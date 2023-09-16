import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----- Esta é uma calculadora de IMC! -----");
        System.out.println("Digite sua altura (em metros com duas casas decimais):");
        double altura = entrada.nextDouble();

        System.out.println("Agora digite seu peso (em quilos):");
        double peso = entrada.nextDouble();

        double imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.printf("Seu IMC é %.2f, e você está abaixo do peso ideal.%n", imc);
        }else if(imc >= 18.5 && imc < 25){
            System.out.printf("Seu IMC é %.2f, e você está no peso ideal.%n", imc);
        }else if(imc >= 25 && imc < 30){
            System.out.printf("Seu IMC é %.2f, e você está com sobrepeso.%n", imc);
        }else if(imc >= 30){
            System.out.printf("Seu IMC é %.2f, e vocÊ está na faixa da obesidade.", imc);
        }
    }
}

