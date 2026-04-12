package nivel1.ex092_converter_metros_para_centimetros;

import java.util.Scanner;

public class ConverterMetrosParaCentimetros {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("==== CONVERSOR: METROS PARA CENTÍMETROS ====");
            System.out.print("Informe quantos metros(m)?: ");
            double metros = sc.nextDouble();

            System.out.printf("%.2f metros é igual a %.2f centímetros.%n",
                    metros,
                    converterMetroParaCentimetros(metros));
        }
    }

    private static double converterMetroParaCentimetros(double metros) {
        final int CENTIMETROS_POR_METRO = 100;
        return metros * CENTIMETROS_POR_METRO;
    }
}
