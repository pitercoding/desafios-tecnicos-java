package celsius.fahrenheit;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("| 01 Fahrenheit para Celsius");
        System.out.println("| 02 Celsius para Fahrenheit");
        try {
            int escolha = input.nextInt();
            double fahrenheit = 0;
            double celsius = 0;
            switch (escolha) {
                case 1:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    fahrenheit = input.nextDouble();
                    celsius = calcularCelsius(fahrenheit);
                    System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Celsius:");
                    celsius = input.nextDouble();
                    fahrenheit = calcularFahrenheit(celsius);
                    System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Use o sistema corretamente!");
        }
        input.close();
    }

    public static double calcularFahrenheit(double valor) {
        return (valor * 1.8) + 32;
    }

    public static double calcularCelsius(double valor) {
        return (valor - 32) * 5 / 9;
    }
}
