package nivel2.ex086_moda_array;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 4, 3, 3, 3, 2, 5};

        int moda = calcularModa(numeros);

        System.out.println("Moda: " + moda);
    }

    public static int calcularModa(int[] numeros) {

        if(numeros == null || numeros.length == 0){
            throw new IllegalArgumentException("O array não pode ser vazio ou nulo.");
        }

        Map<Integer, Integer> frequencia = new HashMap<>();

        // conta frequências
        for(int numero : numeros){
            frequencia.put(
                    numero,
                    frequencia.getOrDefault(numero, 0) + 1
            );
        }

        int moda = numeros[0];
        int maxFrequencia = 0;

        // encontra maior frequência
        for(Map.Entry<Integer, Integer> entry : frequencia.entrySet()){

            if(entry.getValue() > maxFrequencia){
                maxFrequencia = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}
