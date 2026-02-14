package nivel1.ex077_hipotenusa_triangulo_retangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Calculadora de Hipotenusa ===");
            System.out.print("Digite o valor do cateto adjacente: ");
            double catetoAdjacente = scanner.nextDouble();
            System.out.print("Digite o valor do cateto oposto: ");
            double catetoOposto = scanner.nextDouble();

            if (catetoAdjacente <= 0 || catetoOposto <= 0) {
                System.out.println("Os valores dos catetos devem ser positivos.");
                return;
            }

            double hipotenusa = Math.sqrt(catetoAdjacente * catetoAdjacente + catetoOposto * catetoOposto);
            System.out.printf("A hipotenusa vai medir %.2f%n", hipotenusa);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}
