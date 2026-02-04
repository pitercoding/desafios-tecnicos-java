package nivel2.ex007_tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==== INICIALIZANDO PROGRAMA ====");
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("\nTabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            System.out.println("=====================");
        } catch (Exception e) {
            System.out.println("[ERRO!]Informe um número inteiro válido!");
        } finally {
            scanner.close();
        }
    }
}