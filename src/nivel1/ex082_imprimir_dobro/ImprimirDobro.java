package nivel1.ex082_imprimir_dobro;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ImprimirDobro {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Digite um numero (use ponto, ex: 1.5): ");
            double num = sc.nextDouble();

            System.out.println("O dobro de " + num + " é: " + calcularDobro(num));
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Digite apenas um número!");
        }
    }

    private static double calcularDobro(double num){
        return num * 2;
    }
}
