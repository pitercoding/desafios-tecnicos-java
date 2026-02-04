package nivel1.ex021_array_media_do_aluno;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMediaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("Informe suas 5 notas e saiba sua média!");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota: ");

            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida! Digite a " + (i + 1) + "ª nota: ");
                scanner.next(); // descarta a entrada inválida
            }

            notas[i] = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("Suas notas: " + Arrays.toString(notas));

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("Sua média: " + media);

    }
}
