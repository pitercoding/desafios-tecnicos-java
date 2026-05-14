package nivel2.ex072_elemento_impar;

public class ElementoImpar {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 2, 3, 1, 3, 3, 1};

        int resultado = encontrarElementoImpar(numeros);
        System.out.println("Elemento ímpar: " + resultado);
    }

    public static int encontrarElementoImpar(int[] numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado ^= numero;
        }
        return resultado;
    }
}
