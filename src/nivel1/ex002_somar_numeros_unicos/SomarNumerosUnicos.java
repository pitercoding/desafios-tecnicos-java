package nivel1.ex002_somar_numeros_unicos;

import java.util.HashMap;
import java.util.Map;

public class SomarNumerosUnicos {

    public static int somarNumerosUnicos(int[] numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for(int num : numeros) {
            frequencia.put(num, frequencia.getOrDefault(num, 0)+ 1);
        }

        int soma = 0;
        for (Map.Entry<Integer, Integer> entrada : frequencia.entrySet()) {
            if (entrada.getValue() == 1) {
                soma += entrada.getKey();
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 2, 4};
        int resultado = somarNumerosUnicos(numeros);
        System.out.println("Soma dos números únicos: " + resultado);
    }
}