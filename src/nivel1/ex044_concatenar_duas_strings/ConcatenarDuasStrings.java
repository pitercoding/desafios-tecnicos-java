package nivel1.ex044_concatenar_duas_strings;

import java.util.Scanner;

public class ConcatenarDuasStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Concatenador De Strings ====");
        System.out.print("Primeira Frase: ");
        String primeiraFrase = scanner.nextLine().trim();
        System.out.print("Segunda Frase: ");
        String segundaFrase = scanner.nextLine().trim();

        String resultado = primeiraFrase.concat(" ").concat(segundaFrase);
        System.out.println(resultado);

        scanner.close();
    }
}
