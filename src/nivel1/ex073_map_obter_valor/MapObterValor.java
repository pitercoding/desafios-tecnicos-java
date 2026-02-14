package nivel1.ex073_map_obter_valor;

import java.util.HashMap;
import java.util.Map;

public class MapObterValor {
    public static void main(String[] args) {
        Map<String, Double> usuarios = new HashMap<>();
        usuarios.put("Racha Cuca", 123456.78);
        usuarios.put("Tripa Seca", 987654.32);
        usuarios.put("Quase Nada", 12345.67);

        String chave = "Tripa Seca";
        if (usuarios.containsKey(chave)) {
            System.out.println(usuarios.get(chave));
        } else {
            System.out.println("Chave não encontrada.");
        }
    }
}
