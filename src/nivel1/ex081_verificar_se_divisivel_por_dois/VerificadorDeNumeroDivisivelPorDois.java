package nivel1.ex081_verificar_se_divisivel_por_dois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeNumeroDivisivelPorDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Número Divisível Por Dois? ====");
        System.out.print("Digite um número inteiro: ");

        try {
            int num = sc.nextInt();

            if(isDivisivelPorDois(num)){
                System.out.println(num + " é divisível por 2");
            } else {
                System.out.println(num + " não é divisível por 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas números inteiros são aceitos!");
        } finally {
            sc.close();
        }
    }

    private static boolean isDivisivelPorDois(int num) {
        return num % 2 == 0;
    }
}