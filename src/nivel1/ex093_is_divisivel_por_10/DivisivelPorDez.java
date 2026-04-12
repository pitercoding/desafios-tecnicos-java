package nivel1.ex093_is_divisivel_por_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisivelPorDez {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");
            int numero = input.nextInt();

            if(isDivisivelPor10(numero)){
                System.out.println(numero + " é divisível por 10. Resultado = " + dividePorDez(numero));
            } else {
                System.out.println(numero + " NÃO é divisível por 10.");
            }
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas números inteiros são aceitos!");
        }
    }

    private static int dividePorDez(int numero) {
        final int DIVISOR = 10;
        return numero / DIVISOR;
    }

    private static boolean isDivisivelPor10(int numero) {
        return numero % 10 == 0;
    }
}
