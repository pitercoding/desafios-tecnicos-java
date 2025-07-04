package desafio001;

import java.util.HashMap;
import java.util.Map;

public class soma {
    
    public static int somarNumerosunicos(int[] numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>(); // Mapa para contar a frequência de cada número

        for (int num : numeros) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1); // Se o número já estiver no mapa, incrementa +1; senão, começa com 1
        }

        int soma = 0;
        for(Map.Entry<Integer, Integer> entrada : frequencia.entrySet()) {
            if (entrada.getValue() == 1) {
                soma += entrada.getKey();
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 2, 4};
        int resultado = somarNumerosunicos(numeros);
        System.out.println("Soma dos números únicos: " + resultado);
    }
}
