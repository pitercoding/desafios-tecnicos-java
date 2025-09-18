package trocar.valor;

import java.util.Scanner;

public class TrocarValorDeVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        while (true) {
            System.out.print("Informe um número inteiro entre 1 e 10: ");
            a = scanner.nextInt();
            System.out.print("Informe outro número inteiro entre 1 e 10: ");
            b = scanner.nextInt();

            if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
                break;
            } else {
                System.out.println("[ERRO] Ambos os números devem estar entre 1 e 10. Tente novamente.\n");
            }
        }

        System.out.println("\nAntes da troca: ");
        System.out.printf("a = %d, b = %d%n", a, b);

        System.out.println("\nInvertendo...");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nApós a troca: ");
        System.out.printf("a = %d, b = %d", a, b);

        scanner.close();
    }
}
