package numero.secreto;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {

        /**
         * Armazene um número secreto e peça tentativas até o usuário acertar.
         * Diga se o número digitado é maior ou menor.
         */

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroSorteado = random.nextInt(100
        );

        int valor = 0;

        System.out.println("=== Jogo da Adivinhação! ===");
        while (numeroSorteado != valor) {
            System.out.print("\nInforme um número de 1 a 100: ");
            valor = scanner.nextInt();
            if (numeroSorteado > valor) {
                System.out.println("[ERROU!]" + valor + " é MENOR que o valor sorteado!");
            } else if (numeroSorteado < valor) {
                System.out.println("[ERROU!]" + valor + " é MAIOR que o valor sorteado!");
            } else {
                System.out.println("[ACERTOU!] PARABÉNS! o valor sorteado foi: " + numeroSorteado);
            }
        }
        System.out.println("Finalizando jogo...");
        scanner.close();
    }
}
