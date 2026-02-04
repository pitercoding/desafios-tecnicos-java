package nivel2.ex026_media_ponderada;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double somaNotasPesos = 0;
        double somaPesos = 0;

        for (int i = 1; i <= qtdNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();

            somaNotasPesos += nota * peso;
            somaPesos += peso;
        }

        if (somaPesos > 0) {
            double mediaPonderada = somaNotasPesos / somaPesos;
            System.out.printf("Média ponderada = %.2f%n", mediaPonderada);
        } else {
            System.out.println("Erro: a soma dos pesos não pode ser zero.");
        }

        scanner.close();
    }
}
