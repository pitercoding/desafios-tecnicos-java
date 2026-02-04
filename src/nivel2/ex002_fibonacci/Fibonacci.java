package nivel2.ex002_fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("=== Sequência de Fibonacci ====");
            System.out.print("Digite o número de termos da sequência de Fibonacci: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, digite um número positivo.");
                return;
            }

            System.out.println("***** RESULTADO *****");
            System.out.println("Sequência de Fibonacci com " + n + " termos:");

            int primeiro = 0;
            int segundo = 1;

            for (int i = 0; i < n; i++) { // Garante imprimir n termos da sequência
                System.out.print(primeiro + " ");
                int proximo = primeiro + segundo; // Soma dos dois anteriores
                primeiro = segundo;
                segundo = proximo;
            }
        } catch (Exception e) {
            System.out.println("Erro: digite um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}