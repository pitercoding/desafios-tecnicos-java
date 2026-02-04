package nivel1.ex036_numero_entre10_e20;

import java.util.Scanner;

public class NumeroEntre10E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20){
            System.out.println("✅ O número está entre 10 e 20 (inclusive).");
        } else {
            System.out.println("❌ O número NÃO está entre 10 e 20.");
        }
        scanner.close();
    }
}
