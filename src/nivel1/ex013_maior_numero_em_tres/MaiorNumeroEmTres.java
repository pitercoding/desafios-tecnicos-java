package nivel1.ex013_maior_numero_em_tres;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorNumeroEmTres {
    public static void main(String[] args) {
        ArrayList<Double> listaNumeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 números:");

        for (int i = 0; i < 3; i++) {
            try {
                double num = input.nextDouble();
                listaNumeros.add(num);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número.");
                input.next();
                i--;
            }
        }

        double maior = calcularMaiorNumero(listaNumeros.get(0), listaNumeros.get(1), listaNumeros.get(2));
        System.out.printf("Maior: %.2f\n", maior);
    }

    public static double calcularMaiorNumero(double n1, double n2, double n3) {
        double maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;
        return maior;
    }
}
