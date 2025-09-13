package numero.perfeito;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        /**
         * 033. Verificar número perfeito
         * Um número é perfeito se a soma dos seus divisores próprios
         * (excluindo ele mesmo) for igual a ele.
         * → Ex: 6 → 1 + 2 + 3 = 6
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Número Perfeito ====");
        System.out.print("Informe um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i < numeroDigitado; i++) {
            if (numeroDigitado % i == 0) {
                soma += i;
            }
        }

        if (soma == numeroDigitado) {
            System.out.printf("O número %d é perfeito!", numeroDigitado);
        } else {
            System.out.printf("O número %d não é perfeito!", numeroDigitado);
        }
        scanner.close();
    }
}
