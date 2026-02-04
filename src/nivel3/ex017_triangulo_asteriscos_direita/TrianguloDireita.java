package nivel3.ex017_triangulo_asteriscos_direita;

import java.util.Scanner;

public class TrianguloDireita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da pirâmide: ");
        int tamanho = input.nextInt();
        gerarTriangulo(tamanho);
        input.close();

    }

    public static void gerarTriangulo(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            System.out.println(" ".repeat(tamanho - linha) + "*".repeat(linha));
        }
    }
}