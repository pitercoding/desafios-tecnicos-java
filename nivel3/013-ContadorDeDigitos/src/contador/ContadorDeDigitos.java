package contador;

import java.util.Scanner;

public class ContadorDeDigitos {

    /**
     * 037. Contar dígitos de um número
     * Peça um número inteiro
     * Conte quantos dígitos ele possui usando while.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Quantidade de dígitos: 1");
        } else {
            numero = Math.abs(numero); // Garante que o número seja positivo

            int contador = 0;

            while (numero != 0) {
                numero = numero / 10;
                contador++;
            }
            System.out.println("Quantidade de dígitos: " + contador);
        }
        scanner.close();
    }
}