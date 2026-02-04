package nivel1.ex035_jogo_de_adivinhacao_simples;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        System.out.println("===== Jogo da Adivinhação =====");
        System.out.println("Digite seu palpipe entre 1 e 10! Você tem 5 tentativas!");

        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < 5) {
            System.out.print((tentativas + 1) + "ª tentativa: ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 10) {
                System.out.println("[ERRO!] Número inválido. Informe um número entre 1 e 10!");
                continue;
            }

            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.printf("\nParabéns!!! Você acertou com %d tentativa(s). O número secreto é %d.\n", tentativas, numeroSecreto);
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Errado! O número secreto é maior.");
            } else {
                System.out.println("Errado! O número secreto é menor.");
            }
        }

        if (!acertou) {
            System.out.printf("\nFim das tentativas. Você perdeu! O número secreto era %d.\n", numeroSecreto);
        }

        scanner.close();
    }
}
