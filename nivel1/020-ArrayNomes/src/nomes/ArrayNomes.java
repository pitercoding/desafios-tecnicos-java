package nomes;

import java.util.Scanner;

public class ArrayNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Informe 5 nomes. Apenas letras são aceitas!");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "° nome: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty() || !entrada.matches("[\\p{L} ]+")) { //usar \\p{L} representa qualquer letra Unicode, incluindo acentos
                System.out.println("ERRO! Informe apenas letras.");
                i--; // repete esta posição
                continue;
            }

            nomes[i] = entrada;
        }

        scanner.close();

        // Imprimindo nomes
        System.out.println("\nNomes informados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
