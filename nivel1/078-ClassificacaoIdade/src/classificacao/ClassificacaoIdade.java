package classificacao;

import java.util.Scanner;

public class ClassificacaoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = lerIdadeValida(scanner);

        String classificacao;
        if (idade <= 12) {
            classificacao = "Criança";
        } else if (idade <= 17) {
            classificacao = "Adolescente";
        } else if (idade <= 64) {
            classificacao = "Adulto";
        } else {
            classificacao = "Idoso";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    private static int lerIdadeValida(Scanner scanner) {
        int idade;

            System.out.println("==== Classificador de Idade ====");

        while (true) {
            System.out.print("Digite a idade da pessoa (0 a 120): ");

            try {
                idade = scanner.nextInt();
                if (idade < 0 || idade > 120) {
                    System.out.println("[ERRO!] Idade fora do intervalo válido. Tente novamente.");
                } else {
                    return idade;
                }
            } catch (Exception e) {
                System.out.println("[ERRO!] Entrada inválida. Informe um número inteiro.");
                scanner.nextLine();
            }
        }
    }
}
