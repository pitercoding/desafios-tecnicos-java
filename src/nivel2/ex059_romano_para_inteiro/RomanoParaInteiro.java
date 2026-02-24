package nivel2.ex059_romano_para_inteiro;

import java.util.HashMap;
import java.util.Map;

public class RomanoParaInteiro {
    public static void main(String[] args) {
        System.out.println(converterRomanoParaInteiro("III"));     // 3
        System.out.println(converterRomanoParaInteiro("IV"));      // 4
        System.out.println(converterRomanoParaInteiro("IX"));      // 9
        System.out.println(converterRomanoParaInteiro("LVIII"));   // 58
        System.out.println(converterRomanoParaInteiro("MCMXCIV")); // 1994
    }

    public static int converterRomanoParaInteiro(String romano) {

        // 1. Mapa com valores dos símbolos
        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int total = 0;

        // 2. Percorrer a string
        for (int i = 0; i < romano.length(); i++) {

            int valorAtual = mapa.get(romano.charAt(i));

            // 3. Verifica se existe próximo caractere
            if (i < romano.length() - 1) {
                int valorProximo = mapa.get(romano.charAt(i + 1));

                // 4️⃣ Regra de subtração
                if (valorAtual < valorProximo) {
                    total -= valorAtual;
                } else {
                    total += valorAtual;
                }
            } else {
                // Último caractere (sempre soma)
                total += valorAtual;
            }
        }

        return total;
    }

}
