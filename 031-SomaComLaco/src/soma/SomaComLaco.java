package soma;

import java.util.Scanner;

public class SomaComLaco {
    public static void main(String[] args) {
        /**
         * 032. Soma até número negativo
         * O programa deve somar os números digitados
         * até que o usuário informe um número negativo.
         */
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int valor = 0;

        while (valor >= 0) {
            System.out.print("Informe um valor inteiro (negativo para sair): ");
            valor = scanner.nextInt();
            if (valor >= 0) {
                soma += valor;
            }
        }
        System.out.printf("\nA soma dos valores é: " + soma);
        scanner.close();
    }
}
