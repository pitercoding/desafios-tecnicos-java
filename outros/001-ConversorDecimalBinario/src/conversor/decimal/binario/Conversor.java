package conversor.decimal.binario;

import java.util.Scanner;

public class Conversor {
    // Veja um conversor bacana em https://basesnumericas.pages.dev/conversor

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        long numero = input.nextLong();
        System.out.printf("%d (base 10) = %s (base 2)%n", numero, converter(numero));
        input.close();
    }


    public static String converter(long numero){
        return Long.toBinaryString(numero);
    }
}
