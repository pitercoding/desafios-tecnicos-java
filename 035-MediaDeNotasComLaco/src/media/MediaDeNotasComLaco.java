package media;

import java.util.Scanner;

public class MediaDeNotasComLaco {
    /**
     * 035. Média de notas com laço
     * O usuário digita as notas dos alunos (até digitar -1).
     * Ao final, calcule e exiba a média das notas.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorDeNotas = 0;
        double somatorioDasNotas = 0;
        double nota;

        do {
            System.out.print("Nota do aluno (-1 para calcular média): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                somatorioDasNotas += nota;
                contadorDeNotas++;
            }

        } while (nota != -1);

        if (contadorDeNotas > 0) {
            double media = somatorioDasNotas / contadorDeNotas;
            System.out.println("\nA média do aluno é: " + media);
        } else {
            System.out.println("\nNenhuma nota válida foi inserida.");
        }
        scanner.close();
    }
}
