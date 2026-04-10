package nivel1.ex083_imprimir_triplo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ImprimirTriplo {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in).useLocale(Locale.US)){
            System.out.print("Digite um numero (use ponto, ex: 1.5): ");
            double num = input.nextDouble();

            System.out.println("O triplo de " + num + " é: " + calcularTriplo(num));
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas um número é aceito!");
        }
    }

    private static double calcularTriplo(double num){
        return num * 3;
    }
}
