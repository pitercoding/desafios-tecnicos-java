package numeroprimo;

import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int numero) {
        if (numero < 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==== VERIFICADOR DE NÚMERO PRIMO ====");
            System.out.printf("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.print("RESULTADO: ");
            if (ehPrimo(numero)) {
                System.out.print(numero + " é primo!");
            } else {
                System.out.print(numero + " NÃO é primo!");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}