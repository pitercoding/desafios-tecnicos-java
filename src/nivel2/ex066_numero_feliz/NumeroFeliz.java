package nivel2.ex066_numero_feliz;

import java.util.HashSet;
import java.util.Set;

public class NumeroFeliz {

    public static void main(String[] args) {

        int numero = 2; // não é

        if (ehFeliz(numero)) {
            System.out.println(numero + " é um número feliz!");
        } else {
            System.out.println(numero + " não é um número feliz!");
        }
    }

    public static boolean ehFeliz(int numero) {

        Set<Integer> numerosVistos = new HashSet<>();

        while (numero != 1 && !numerosVistos.contains(numero)) {

            numerosVistos.add(numero);

            int soma = 0;

            while (numero > 0) {
                int digito = numero % 10;

                soma += digito * digito;

                numero /= 10;
            }

            numero = soma;
        }

        return numero == 1;
    }
}
