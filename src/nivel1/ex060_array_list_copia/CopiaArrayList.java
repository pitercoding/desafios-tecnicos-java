package nivel1.ex060_array_list_copia;

import java.util.ArrayList;

public class CopiaArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Racha Cuca");
        nomes.add("Poucas Trancas");
        nomes.add("Tripa Seca");
        nomes.add("Quase Nada");

        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");

        ArrayList<String> copia = new ArrayList<>(nomes);

        System.out.println(copia);

        for (String nome : copia) {
            System.out.println(nome);
        }

    }

}
