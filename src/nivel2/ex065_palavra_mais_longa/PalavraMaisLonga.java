package nivel2.ex065_palavra_mais_longa;

public class PalavraMaisLonga {
    public static void main(String[] args) {
        String frase = "A Biologia é a ciência natural que estuda a vida e os organismos vivos em todos os seus níveis de organização, desde moléculas e células até ecossistemas inteiros.";
        System.out.println(encontrarMaiorPalavra(frase));
    }

    public static String encontrarMaiorPalavra(String frase) {

        if (frase == null || frase.isEmpty()) {
            return "";
        }

        String[] palavras = frase.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚçÇ ]", "").split(" ");
        String maiorPalavra = "";

        for (String palavra : palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }

        return maiorPalavra;
    }
}
