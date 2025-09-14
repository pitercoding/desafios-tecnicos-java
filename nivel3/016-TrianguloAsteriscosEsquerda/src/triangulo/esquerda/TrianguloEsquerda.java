package triangulo.esquerda;

import java.util.Scanner;

public class TrianguloEsquerda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja uma pirâmide com quantas linhas? ");
        int tamanho = input.nextInt();
        gerarTriangulo(tamanho);
    }

    public static void gerarTriangulo(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            System.out.println("*".repeat(linha));
        }
    }
}