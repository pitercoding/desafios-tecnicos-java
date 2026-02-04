package nivel3.ex003_soma_com_laco;

import java.util.Scanner;

public class SomaComLaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        do {
            System.out.printf("Informe o %dº número: ", contador + 1);
            int valor = scanner.nextInt();

            soma += valor;
            contador++;

        } while (contador != 10);

        System.out.println("\nA soma dos valores é " + soma);
        scanner.close();
    }
}
