package ultimo.caractere;

import java.util.Scanner;

public class UltimoCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().trim();

        if (!texto.isEmpty()) {
            char ultimoCaractere = texto.charAt(texto.length() - 1);
            System.out.println("Último caractere: " + ultimoCaractere);
        } else {
            System.out.println("Texto vazio. Nenhum caractere para exibir.");
        }
        scanner.close();
    }
}
