package duplicadosarray;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> setSemDuplicados = new LinkedHashSet<>();

        for (int num : numeros) {
            setSemDuplicados.add(num);
        }

        Integer[] resultado = setSemDuplicados.toArray(new Integer[0]);

        System.out.println("Array sem duplicados: " + Arrays.toString(resultado));
    }
}

// Set<Integer>	Cria uma coleção que não aceita repetidos
// LinkedHashSet Mantém a ordem original dos elementos
// for (int num : numeros) Percorre cada número do array
// setSemDuplicados.add(num) Adiciona ao Set, mas ignora os duplicados automaticamente
// toArray(new Integer[0])	Transforma o Set de volta em um array
// Arrays.toString(...)	Converte o array para uma String bonitinha para impressão