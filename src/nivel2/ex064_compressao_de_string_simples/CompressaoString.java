package nivel2.ex064_compressao_de_string_simples;

public class CompressaoString {
    public static void main(String[] args) {
        String texto = "aaabbc";
        System.out.println(compress(texto));
    }

    public static String compress(String texto) {
        if(texto == null || texto.isEmpty()){
            return "Texto vazio...";
        }

        StringBuilder resultado = new StringBuilder();

        char atual = texto.charAt(0);
        int contador = 1;

        for(int i = 1; i < texto.length(); i++){
            char c = texto.charAt(i);

            if(c == atual){
                contador++;
            } else {
                resultado.append(atual).append(contador);
                atual = c;
                contador = 1;
            }
        }

        resultado.append(atual).append(contador);
        return resultado.toString();
    }

}
