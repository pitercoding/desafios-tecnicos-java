package nivel2.ex037_lambda_ordenar_lista_strings;

import java.util.Arrays;
import java.util.List;

public class LambdaOrdenarListaStrings {
    public static void main(String[] args) {
        List<String> listaDeCompras = Arrays.asList("Feijão", "Arroz", "Macarrão", "Alface", "Tomate", "Vinho", "Água", "Batata");
        listaDeCompras.sort((a , b) -> a.compareTo(b));
        System.out.println("Lista de Compras Ordenada: " + listaDeCompras);
    }
}
