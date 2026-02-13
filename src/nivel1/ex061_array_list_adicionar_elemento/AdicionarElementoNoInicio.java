package nivel1.ex061_array_list_adicionar_elemento;

import java.util.ArrayList;

public class AdicionarElementoNoInicio {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Racha Cuca");
        nomes.add("Poucas Trancas");
        nomes.add("Tripa Seca");
        nomes.add("Quase Nada");

        System.out.println(nomes);
        System.out.println("==================================================================");
        nomes.add(0, "Alma Negra");
        System.out.println(nomes);
    }
}
