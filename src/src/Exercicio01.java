import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá. Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Agora digite seu nome:");
        String nome = entrada.nextLine();

        System.out.printf("Seja bem vindo %s %s!%n", nome, sobrenome);

        String nomeCompleto = nome + " " + sobrenome;
        String nomeSemEspaco = nomeCompleto.replace(" ", "");

        int qntLetras = nomeSemEspaco.length();

        System.out.printf("%s, seu nome possui %d letras. %n", nome, qntLetras);

    }
}
