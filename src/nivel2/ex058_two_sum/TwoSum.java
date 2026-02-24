package nivel2.ex058_two_sum;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int alvo = 9;

        System.out.println("Alvo: " + alvo);

        Set<Integer> numeros = new HashSet<>();

        for (int numero : array) {
            int complemento = alvo - numero;

            if (numeros.contains(complemento)) {
                System.out.println("Par encontrado: " + numero + " e " + complemento);
                return;
            }

            numeros.add(numero);
        }
        System.out.println("Nenhum par encontrado.");
    }
}
