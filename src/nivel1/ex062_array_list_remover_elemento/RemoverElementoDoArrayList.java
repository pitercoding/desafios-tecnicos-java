package nivel1.ex062_array_list_remover_elemento;

import java.util.ArrayList;

public class RemoverElementoDoArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Racha Cuca");
        nomes.add("Poucas Trancas");
        nomes.add("Tripa Seca");
        nomes.add("Quase Nada");

        System.out.println(nomes);
        System.out.println("===================================================");
        nomes.remove(2);
        System.out.println(nomes);
    }
}
