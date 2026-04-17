package nivel1.ex096_impimir_primeiro_inteiro_do_array;

public class PrimeiroInteiroDoArray {
    public static void main(String[] args) {
        int[] numeros = {6, 3, 2, 10, 7};

        System.out.println("Primeiro elemento: " + obterPrimeiroElemento(numeros));
    }

    private static int obterPrimeiroElemento(int[] numeros){
        if (numeros == null || numeros.length == 0){
            throw new IllegalArgumentException("Array inválido!");
        }
        return numeros[0];
    }
}
