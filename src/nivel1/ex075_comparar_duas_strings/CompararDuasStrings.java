package nivel1.ex075_comparar_duas_strings;

import java.util.Scanner;

public class CompararDuasStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Comparador De Strings ====");
        System.out.print("Primeira Frase: ");
        String primeiraFrase = scanner.nextLine().trim().toLowerCase();
        System.out.print("Segunda Frase: ");
        String segundaFrase = scanner.nextLine().trim().toLowerCase();

        if (primeiraFrase.equals(segundaFrase)) {
            System.out.println("As frases são iguais.");
        } else {
            System.out.println("As frases são diferentes.");
        }

        scanner.close();
    }
}
