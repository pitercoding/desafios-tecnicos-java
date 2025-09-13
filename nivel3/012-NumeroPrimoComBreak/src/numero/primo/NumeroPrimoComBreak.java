package numero.primo;

import java.util.Scanner;

public class NumeroPrimoComBreak {
    /**
     * 036. Número Primo com break
     * Dado um número,
     * verifique se é primo
     * interrompendo o laço assim que encontrar um divisor.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int n = scanner.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " NÃO é primo.");
        }

        scanner.close();
    }
}
