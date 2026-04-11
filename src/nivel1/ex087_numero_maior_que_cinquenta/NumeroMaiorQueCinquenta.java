package nivel1.ex087_numero_maior_que_cinquenta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMaiorQueCinquenta {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");
            double numero = input.nextDouble();

            System.out.println(isMaiorQueCinquenta(numero));

        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas números são aceitos!");
        }
    }

    private static boolean isMaiorQueCinquenta(double num) {
        return num > 50;
    }
}
