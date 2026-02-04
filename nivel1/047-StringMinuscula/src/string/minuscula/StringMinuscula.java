package string.minuscula;

import java.util.Scanner;

public class StringMinuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra, frase ou texto: ");
        String texto = scanner.nextLine().trim();

        if (!texto.isEmpty()) {
            System.out.println(texto.toLowerCase());
        } else {
            System.out.println("Palavra, frase ou texto vazio. Nenhum caractere para exibir.");
        }
        scanner.close();
    }
}
