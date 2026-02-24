package nivel2.ex060_inteiro_para_romano;

public class InteiroParaRomano {
    public static void main(String[] args) {
        System.out.println(converterInteiroParaRomano(3));     // III
        System.out.println(converterInteiroParaRomano(4));     // IV
        System.out.println(converterInteiroParaRomano(9));     // IX
        System.out.println(converterInteiroParaRomano(58));    // LVIII
        System.out.println(converterInteiroParaRomano(1994));  // MCMXCIV
    }

    public static String converterInteiroParaRomano(int numero) {
        int[] valores = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        String[] romanos = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                resultado.append(romanos[i]);
                numero -= valores[i];
            }
        }
        return resultado.toString();
    }
}
