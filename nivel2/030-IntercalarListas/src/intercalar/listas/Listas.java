package intercalar.listas;

import java.util.List;

public class Listas {


        public static void main(String[] args) {
            List<String> lista1 = List.of("A", "B", "C");
            List<String> lista2 = List.of("1", "2", "3", "4", "5");

            System.out.println("Teste: lista 1 menor que lista 2");
            Listas.intercalarListas(lista1, lista2);

            System.out.println("Teste: lista 1 igual lista 2");
            lista2 = List.of("X", "Y", "Z");
            Listas.intercalarListas(lista1, lista2);

            System.out.println("Teste: lista 1 maior que lista 2");
            lista1 = List.of("A", "B", "C", "D");
            lista2 = List.of("9", "8");
            Listas.intercalarListas(lista1, lista2);
        }



    public static void intercalarListas(List lista1, List lista2){
        int tamanhoLista1 = lista1.size();
        int tamanhoLista2 = lista2.size();

        System.out.println("=====================");

        if(tamanhoLista1 == tamanhoLista2){
            for(int i = 0; i < tamanhoLista1; i++){
                System.out.println("Lista 1: " + lista1.get(i) + " Lista 2: " + lista2.get(i));
            }
            return;
        } else if(tamanhoLista1 < tamanhoLista2){
            for(int i = 0; i < tamanhoLista1; i++){
                System.out.println("Lista 1: " + lista1.get(i) + " Lista 2: " + lista2.get(i));
            }
            for(int i = tamanhoLista1; i < tamanhoLista2; i++){
                System.out.println("Lista 2: " + lista2.get(i));
            }
        } else {
            for(int i = 0; i < tamanhoLista2; i++){
                System.out.println("Lista 1: " + lista1.get(i) + " Lista 2: " + lista2.get(i));
            }
            for(int i = tamanhoLista2; i < tamanhoLista1; i++){
                System.out.println("Lista 1: " + lista1.get(i));
            }
        }
        System.out.println("=====================");
    }
}
