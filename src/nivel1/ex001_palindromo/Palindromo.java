package nivel1.ex001_palindromo;

import java.util.Scanner;
public class Palindromo {
    public static boolean isPalindrome(String texto) {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();
        return textoLimpo.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Verificador de palíndromo ===");
        System.out.print("Digite uma palavra ou frase: ");
        String str1 = scanner.nextLine();
        System.out.println(str1 + " é palíndromo? " + isPalindrome(str1));

    }
}