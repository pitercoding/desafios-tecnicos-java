package nivel1.ex011_calcular_area_circulo;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do Raio: ");
        double valor = input.nextDouble();
        double areaCirculo = calcularArea(valor);
        System.out.printf("Área do Círculo: %.2f%n", areaCirculo);
    }

    public static double calcularArea(double raio) {
        return raio * raio * Math.PI;
    }
}
