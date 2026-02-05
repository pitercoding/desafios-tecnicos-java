package nivel1.ex052_verificar_nome;

import java.util.Scanner;

public class VerificarNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Verificando Nome ===");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        int letras = nome.replace(" ", "").length();

        if (letras <= 4) {
            System.out.printf("%s possui %d letras.%n", nome, letras);
            System.out.println("É um nome curto!");
        } else {
            System.out.printf("%s possui %d letras.%n", nome, letras);
            System.out.println("É um nome longo!");
        }

        scanner.close();
    }
}