package nivel1.ex064_is_soma_maior_que_100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorDeSoma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("===== Verificador de Soma ======");

            double numero1 = lerNumero(scanner, "Digite o primeiro número: ");
            double numero2 = lerNumero(scanner, "Digite o segundo número: ");

            double soma = numero1 + numero2;

            if (soma > 100) {
                System.out.println("A soma é maior que 100! Total = " + soma);
            } else {
                System.out.println("A soma é menor ou igual a 100! Total = " + soma);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite apenas números.");
        } finally {
            scanner.close();
        }
    }

    static double lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
}
