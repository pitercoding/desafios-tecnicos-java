package nivel2.ex084_permutacoes_string;

public class Main {
    public static void main(String[] args) {
        String str = "abc";

        permutar("", str);
    }

    private static void permutar(String prefixo, String restante) {
        int n = restante.length();

        if (n == 0) {
            System.out.println(prefixo);
            return;
        }

        for (int i = 0; i < n; i++) {
            char atual = restante.charAt(i);

            String antes = restante.substring(0, i);
            String depois = restante.substring(i + 1);
            String novoRestante = antes + depois;
            permutar(prefixo + atual, novoRestante);
        }
    }
}
