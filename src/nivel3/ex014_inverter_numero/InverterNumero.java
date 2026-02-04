package nivel3.ex014_inverter_numero;

import java.util.Scanner;

public class InverterNumero {
    /**
     * 038. Inverter número inteiro
     * Digite: 12345
     * Saída: 54321
     * (Dica: use while com % e /)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== INVERSOR DE NÚMEROS ====");
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("Número invertido: ");
        while (numero !=0) {
            int digito = numero % 10;
            numero = numero / 10;

            System.out.print(digito);
        }

        scanner.close();
    }
}
