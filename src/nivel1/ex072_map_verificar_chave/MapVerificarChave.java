package nivel1.ex072_map_verificar_chave;

import java.util.HashMap;
import java.util.Map;

public class MapVerificarChave {
    public static void main(String[] args) {

        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("Racha Cuca", "123456");
        usuarios.put("Tripa Seca", "abcd");
        usuarios.put("Quase Nada", "xyz");

        String chaveBuscada = "Racha Cuca";

        if (usuarios.containsKey(chaveBuscada)) {
            System.out.println("A chave '" + chaveBuscada + "' existe no mapa.");
        } else {
            System.out.println("A chave '" + chaveBuscada + "' não existe no mapa.");
        }
    }
}
