package nivel2.ex090_dividir_lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int n = 3;

        List<List<Integer>> resultado = dividirLista(lista, n);

        System.out.println("Resultado: " + resultado);
    }

    public static List<List<Integer>> dividirLista(List<Integer> lista, int n) {
        List<List<Integer>> resultado = new ArrayList<>();

        int tamanhoBase = lista.size() / n;
        int resto = lista.size() % n;

        int inicio = 0;

        for (int i = 0; i < n; i++) {
            int tamanhoAtual = tamanhoBase + (i < resto? 1 : 0);
            int fim = inicio + tamanhoAtual;
            resultado.add(new ArrayList<>(lista.subList(inicio, fim)));
            inicio = fim;
        }

        return resultado;
    }
}
