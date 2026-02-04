package nivel3.ex006_conta_numeros;

import java.util.Scanner;

public class ContaNumeros {
    public static void main(String[] args) {
        /**
         * 030. Contar números negativos, positivos e zeros
         * O usuário digita 10 números.
         * Conte quantos são negativos, positivos ou zero.
         */
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int contadorZeros = 0;

        do {
            System.out.printf("Informe o %dº número: ", contador + 1);
            int valor = scanner.nextInt();

            if (valor < 0) {
                contadorNegativos++;
            } else if (valor > 0) {
                contadorPositivos++;
            } else if (valor == 0) {
                contadorZeros++;
            }
            contador++;
        } while (contador != 10);

        System.out.printf("\nAo todo foram digitados: ");
        System.out.printf("\n%d números negativos.", contadorNegativos);
        System.out.printf("\n%d números positivos.", contadorPositivos);
        System.out.printf("\n%d números zeros.", contadorZeros);
        scanner.close();
    }
}
