package nivel1.ex043_verificar_numero;

import java.util.Scanner;

public class VerificarNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");

        if (sc.hasNextInt()) {
            numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

        } else {
            System.out.println("Entrada inválida. Digite apenas números inteiros.");
        }

        sc.close();
    }
}