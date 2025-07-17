package potencia;

import java.util.Scanner;

public class GeradorDePotencia {
    /**
     * 034. Gerador de sequência: potências de 2
     * Peça um número n e exiba as potências de 2 até 2^n.
     * → Ex: Entrada: 5 → Saída: 1, 2, 4, 8, 16, 32
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        System.out.println("==== POTÊNCIA DE 2 ====");
        System.out.print("Informe um número inteiro que representará até onde a sequência vai: ");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            int resultado = (int) Math.pow(2, i);  // Calcula 2^i
            if (i == n) {
                System.out.print(resultado);  // Exibe sem a vírgula final
            } else {
                System.out.print(resultado + ", ");  // Exibe com vírgula
            }
        }
        scanner.close();
    }
}
