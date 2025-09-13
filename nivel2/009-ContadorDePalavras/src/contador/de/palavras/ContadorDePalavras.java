package contador.de.palavras;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            String[] palavras = frase.trim().split("\\s+");

            int contador = (frase.trim().isEmpty()) ? 0 : palavras.length;

            System.out.println("Quantidade de palavras: " + contador);
        } catch (Exception e) {
            System.out.println("[ERRO!] Digite palavras para formar uma frase!");
        } finally {
            scanner.close();
        }
    }
}

/*
    `trim()` remove espaços do começo e fim da string.
    `split("\\s+")` divide a frase em palavras usando um ou mais espaços como separador (\\s+ significa “um ou mais espaços”).
    A verificação `frase.trim().isEmpty()` evita contar uma palavra se o usuário só digitou espaços.
 */