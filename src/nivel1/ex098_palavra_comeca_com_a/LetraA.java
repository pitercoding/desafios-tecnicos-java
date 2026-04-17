package nivel1.ex098_palavra_comeca_com_a;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.print("Informe uma palavra: ");
            String palavra = scanner.nextLine().trim();

            if (verificarSeComecaComLetraA(palavra)) {
                System.out.println(palavra + " começa com a letra A!");
            } else {
                System.out.println(palavra + " NÃO começa com a letra A!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO] " + e.getMessage());
        }
    }

    private static boolean verificarSeComecaComLetraA(String palavra) {
        if (palavra == null || palavra.trim().isEmpty()) {
            throw new IllegalArgumentException("A palavra não pode ser vazia!");
        }

        return palavra.toLowerCase().startsWith("a");
    }
}
