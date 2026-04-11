package nivel1.ex090_lista_de_strings;

import java.util.Scanner;

public class ListaDeStrings {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            String[] ingredientes = {"Farinha", "Ovo", "Leite"};

            System.out.print("Digite o nome do ingrediente para saber se ele já está na lista: ");
            String nome = input.nextLine().trim();

            System.out.println(
                    isIngredienteNaLista(ingredientes, nome)
                            ? "Ingrediente está na lista!"
                            : "Ingrediente não está na lista!"
            );
        }
    }

    private static boolean isIngredienteNaLista(String[] lista, String ingrediente) {

        if(ingrediente == null || ingrediente.isEmpty()) {
            throw new IllegalArgumentException("Ingrediente inválido!");
        }

        for(String item: lista){
            if(item.equalsIgnoreCase(ingrediente)){
                return true;
            }
        }

        return false;
    }
}
