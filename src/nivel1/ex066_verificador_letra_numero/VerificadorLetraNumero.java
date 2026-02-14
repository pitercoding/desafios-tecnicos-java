package nivel1.ex066_verificador_letra_numero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorLetraNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Letra ou Número? =====");
        System.out.print("Digite um único caractere: ");
        String entrada = scanner.nextLine().trim();

        if (entrada.length() != 1) {
            System.out.println("Digite apenas um caractere.");
        } else {
            char caractere = entrada.charAt(0);

            if (Character.isLetter(caractere)) {
                System.out.println("Você digitou uma LETRA.");
            } else if (Character.isDigit(caractere)) {
                System.out.println("Você digitou um NÚMERO.");
            } else {
                System.out.println("Não é letra nem número.");
            }
        }
        scanner.close();
    }
}
