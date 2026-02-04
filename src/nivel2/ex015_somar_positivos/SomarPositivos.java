package nivel2.ex015_somar_positivos;

import java.util.Scanner;

public class SomarPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite números separados por espaço: ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(" ");
        int soma = 0;

        for (String parte : partes) {
            try {
                int numero = Integer.parseInt(parte);
                if (numero > 0) {
                    soma += numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ignorado valor inválido: " + parte);
            }
        }
        System.out.println("Soma dos números positivos: " + soma);
        scanner.close();
    }
}

/**
 * split(" ") → separa a entrada do usuário.
 * Integer.parseInt() → converte cada string para número.
 * if (numero > 0) → garante que só positivos sejam somados.
 * try-catch → protege contra valores inválidos (ex: letras).
 */