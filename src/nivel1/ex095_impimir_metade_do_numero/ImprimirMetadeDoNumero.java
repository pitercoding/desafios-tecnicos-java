package nivel1.ex095_impimir_metade_do_numero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImprimirMetadeDoNumero {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite um numero: ");
            double numero = input.nextDouble();

            System.out.println("A metade de " + numero + " é " + calcularMetadeDoNumero(numero));

        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Apenas números são aceitos!");
        }
    }

    private static double calcularMetadeDoNumero(double numero){
        return numero / 2;
    }
}
