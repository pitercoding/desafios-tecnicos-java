package tabuada;

import java.util.Scanner;

public class TabuadaEmLoop {
    public static void main(String[] args) {
        /**
         * 031. Tabuada de vários números
         * O usuário digita um número.
         * Mostre sua tabuada.
         * Depois pergunte se ele quer ver a de outro número.
         * Repita até ele digitar "n".
         */
        Scanner scanner = new Scanner(System.in);

        String continuar = "";

        do {
            System.out.print("\nInforme um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            for (int i = 1; i <= 10 ; i++) {
                int resultado = numero * i;
                System.out.printf("%d x %d = %d\n", numero, i, resultado);
            }

            System.out.print("\nDeseja ver a tabuada de outro número? [S] ou [N]: ");
            continuar = scanner.next().trim().toUpperCase();

        } while (!continuar.equals("N"));
        System.out.println("\nFinalizando Tabuada...");
        scanner.close();
    }
}
