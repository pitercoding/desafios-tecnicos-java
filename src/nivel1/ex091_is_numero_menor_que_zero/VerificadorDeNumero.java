package nivel1.ex091_is_numero_menor_que_zero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeNumero {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite um numero inteiro: ");
            int num = input.nextInt();

            if (isNumeroMenorQueZero(num)) {
                System.out.println(num + " é menor que zero");
            } else {
                System.out.println(num + " NÃO é menor que zero");
            }

        } catch(InputMismatchException e){
            System.out.println("[ERRO] Digite apenas números inteiros!");
        }
    }

    private static boolean isNumeroMenorQueZero(int numero){
        return numero < 0;
    }
}
