package nivel3.ex018_triangulo_simetrico;

import java.util.Scanner;

public class TrianguloSimétrico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja uma pirâmide com quantas linhas? ");
        int linhas = input.nextInt();
        gerarTriangulo(linhas);
        input.close();
    }

    public static void gerarTriangulo(int tamanho) {
        int i = 0;

        for (int linha = 1; linha <= tamanho; linha++) {
            i++;
            System.out.println(" ".repeat(tamanho - linha) + "*".repeat(i * 2 - 1) + " ".repeat(tamanho - linha));
        }
    }
}

