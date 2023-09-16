import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        LocalDate dataBase = LocalDate.now();

        System.out.println("Digite sua data de nascimento (formato: ano-mês-dia):");
        String dataNascimentoInput = entrada.nextLine();

        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput);

        Period periodo = Period.between(dataNascimento, dataBase);

        int idade = periodo.getYears();

        System.out.println(idade);

        if (idade < 16 && idade > 0){
            System.out.println("Você ainda não possui idade para votar.");
        } else if (idade == 16 || idade == 17 || idade >= 60){
            System.out.println("Você possui idade para votar, porém não é obrigatório.");
        } else if (idade >= 18 && idade < 60){
            System.out.println("Você possui idade e obrigação de votar.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
