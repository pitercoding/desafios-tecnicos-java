package nivel1.ex038_multiplo_de_tres_ou_cinco;

import java.util.Scanner;

public class MultiploDeTresOuCinco {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numeroInformado = scanner.nextInt();

        String resultado = (numeroInformado % 3 == 0 || numeroInformado % 5 == 0)
                ? numeroInformado + " é múltiplo de 3 ou de 5."
                : numeroInformado + " não é múltiplo de 3 nem de 5.";

        System.out.println(resultado);

        scanner.close();
    }
}
