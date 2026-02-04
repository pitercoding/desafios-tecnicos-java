package nivel3.ex015_jogo_numero_secreto;

import java.util.Random;
import java.util.Scanner;

public class JogoNumeroSecreto {

    /**
     * 039. Jogo de adivinhação com tentativas limitadas
     * Com um número de tentativas definido pelo usuário.
     * Armazene um número secreto
     * Diga se o número digitado é maior ou menor.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100); // Número entre 0 e 99
        int tentativasMaximas, tentativasUsadas = 0;
        boolean acertou = false;

        System.out.println("=== Jogo da Adivinhação! ===");
        System.out.print("Quantas tentativas você quer? ");
        tentativasMaximas = scanner.nextInt();

        System.out.printf("Você usará %d tentativa(s). Vamos começar!\n", tentativasMaximas);

        while (tentativasUsadas < tentativasMaximas) {
            System.out.printf("\nTentativa %d de %d\n", tentativasUsadas + 1, tentativasMaximas);
            System.out.print("Informe um número de 0 a 99: ");
            int palpite = scanner.nextInt();

            if (palpite > numeroSorteado) {
                System.out.printf("[ERROU!] %d é MAIOR que o valor sorteado!\n", palpite);
            } else if (palpite < numeroSorteado) {
                System.out.printf("[ERROU!] %d é MENOR que o valor sorteado!\n", palpite);
            } else {
                System.out.printf("\n[ACERTOU!] PARABÉNS! O valor sorteado foi: %d\n", numeroSorteado);
                System.out.printf("Você utilizou %d tentativa(s).\n", tentativasUsadas + 1);
                acertou = true;
                break;
            }

            tentativasUsadas++;
        }

        if (!acertou) {
            System.out.printf("\n[GAME OVER!] Todas as %d tentativas foram usadas.\n", tentativasMaximas);
            System.out.printf("O número correto era: %d\n", numeroSorteado);
        }

        System.out.println("\nObrigado por jogar!");
        System.out.println("Finalizando jogo...");
        scanner.close();
    }
}
