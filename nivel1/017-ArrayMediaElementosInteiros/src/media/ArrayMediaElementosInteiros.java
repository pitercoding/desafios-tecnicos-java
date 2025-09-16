package media;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMediaElementosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> elementos = new ArrayList<>(); // ArrayList para tamanho dinâmico

        System.out.println("========= CALCULANDO MÉDIA =========");
        System.out.println("Digite números inteiros. Pressione ENTER sem digitar nada para parar.");

        while (true){
            System.out.print("Informe um número inteiro: ");
            String entrada = scanner.nextLine().trim(); // O método trim() remove todos os espaços em branco no início e no fim da String.
            if (entrada.isEmpty()) { // Condição para parar (Enter)
                break;
            }

            try {
                int numero = Integer.parseInt(entrada); // Converte a entrada (String) para inteiro
                elementos.add(numero);
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
        System.out.println("Soma: " + soma);

        // Calculando a média
        if (!elementos.isEmpty()) { // Ou seja, se o ArrayList (elementos) não estiver vazio, faça:
            double media = (double) soma / elementos.size();
            System.out.println("Média: " + media);
        } else { // Se estiver vazio:
            System.out.println("Nenhum número foi informado, média não calculada.");
        }
    }
}
