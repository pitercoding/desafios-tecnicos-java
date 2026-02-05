package nivel1.ex055_idade_hoje;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = LocalDate.now().getYear();
        int anoDeNascimento;

        System.out.println("===== Calculadora de Idade =====");


        try {
            System.out.print("Digite o ano de nascimento: ");
            anoDeNascimento = scanner.nextInt();

            // validação: ano no futuro
            if (anoDeNascimento > anoAtual) {
                System.out.println("Ano inválido: não pode ser no futuro.");
                return;
            }

            // validação: ano muito antigo
            if (anoDeNascimento < 1900) {
                System.out.println("Ano inválido: muito antigo.");
                return;
            }

            int idade = anoAtual - anoDeNascimento;
            System.out.println("Sua idade: " + idade + " anos.");

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
