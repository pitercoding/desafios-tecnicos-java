package contagem.regressiva;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        /**
         * Peça ao usuário um número inteiro e faça uma contagem regressiva até 0, exibindo os números um por um.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("\nContagem regressiva: ");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");
        scanner.close();
    }
}
