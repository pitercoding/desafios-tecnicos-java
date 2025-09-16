package somar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySomarElementosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> elementos = new ArrayList<>(); // ArrayList para tamanho dinâmico

        System.out.println("========= SOMANDO NÚMEROS INTEIROS =========");
        System.out.println("Digite números inteiros. Pressione ENTER sem digitar nada para parar.");

        while (true) {
            System.out.print("Informe um número inteiro: ");
            String entrada = scanner.nextLine().trim(); // O método trim() remove todos os espaços em branco no início e no fim da String.

            if (entrada.isEmpty()) { // Condição para parar (Enter)
                break;
            }

            try {
                int numero = Integer.parseInt(entrada); // Converte a entrada para inteiro
                elementos.add(numero); // Adiciona ao ArrayList
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
            }
        }
        scanner.close();

        // Exibindo os números armazenados no ArrayList
        System.out.println("\nNúmeros informados: " + elementos);

        // Calculando a soma
        int soma = 0;
        for (int numero : elementos) {
            soma += numero;
        }

        System.out.println("Soma dos números informados: " + soma);
    }
}
