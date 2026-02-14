package nivel1.ex074_repetir_string_n_vezes;

import java.util.Scanner;

public class RepetirStringNVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== REPETIR UMA STRING N VEZES =====");
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().trim();

        if (texto.isEmpty()) {
            System.out.println("Texto vazio. Nada para exibir.");
            scanner.close();
            return;
        }

        System.out.print("Digite quantas vezes deseja repetir: ");
        String entrada = scanner.nextLine().trim();

        int repeticoes;
        try {
            repeticoes = Integer.parseInt(entrada);
            if (repeticoes <= 0) {
                System.out.println("Número inválido. Digite um número positivo.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro válido.");
            scanner.close();
            return;
        }

        System.out.println("\nResultado:");
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }

        scanner.close();
    }
}
