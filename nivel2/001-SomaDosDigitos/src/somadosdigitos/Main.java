package somadosdigitos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("==== Soma dos Dígitos ====");
            System.out.print("Digite um número positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo! Digite apenas positivos.");
                return;
            }

            int soma = 0;
            while (numero > 0) {
                soma += numero % 10; // pega o último dígito
                numero /= 10; // remove o último dígito (Atalho: numero = numero / 10;)
            }

            /* 2a Possibilidade:
            String numeroStr = String.valueOf(numero); //Converte o número para String
            for (int i = 0; i < numeroStr.length(); i++) {
                char c = numeroStr.charAt(i); // Pega cada caractere da string
                int digito = Character.getNumericValue(c); // Converte o caractere para número (ex: '3' → 3)
                soma += digito; // Vai somando cada dígito
            } */

            System.out.println("Soma dos dígitos: " + soma);

        } catch (Exception e) {
            System.out.println("Erro: digite um número inteiro válido.");
        } finally {
            scanner.close();
        }

    }
}