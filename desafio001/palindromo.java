package desafio001;

import java.util.Scanner;

public class palindromo {

    public static boolean isPalindrome(String texto) {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();
        return textoLimpo.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Verificador de palíndromo ===");
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.println("Sua palavra " + palavra + " é palíndromo? " + isPalindrome(palavra));
    }
}
