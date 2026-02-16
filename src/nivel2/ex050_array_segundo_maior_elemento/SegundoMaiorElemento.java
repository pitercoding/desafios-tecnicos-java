package nivel2.ex050_array_segundo_maior_elemento;

public class SegundoMaiorElemento {
    public static void main(String[] args) {
        // int[] array = {4,5,6,7};
        // int[] array = {7};
        // int[] array = {};
        int[] array = {5,5,5};

        if (array.length < 2) {
            System.out.println("Array vazio ou com apenas um elemento.");
            return;
        }

        int maior = array[0];
        int segundoMaior = Integer.MIN_VALUE;

        for (int valor : array) {
            if (valor > maior) {
                segundoMaior = maior;
                maior = valor;
            } else if (valor > segundoMaior && valor != maior) {
                segundoMaior = valor;
            }
        }

        if (segundoMaior == Integer.MIN_VALUE) {
            System.out.println("Não existe segundo maior elemento distinto.");
        } else {
            System.out.println("Segundo maior elemento: " + segundoMaior);
        }
    }
}