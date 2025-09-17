package troca.valor.duas.variaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.printf("Digite o valor de B: ");
        int b = sc.nextInt();
        // Operador xor
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        // XOR (ou exclusivo):
        // 0 ^ 0 = 0
        // 1 ^ 1 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1

        System.out.println("A: " + a + " | B: " + b);
    }
}
