package nivel1.ex005_fatorial;

import java.util.Scanner;

public class Fatorial {

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.print(" = "); // Parte final antes do resultado
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=====  F A T O R I A L =====");
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Não é possível calcular fatorial de número negativo.");
            } else {
                long resultado = calcularFatorial(numero);
                System.out.println(resultado);
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
