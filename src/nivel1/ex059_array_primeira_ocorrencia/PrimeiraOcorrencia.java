package nivel1.ex059_array_primeira_ocorrencia;

public class PrimeiraOcorrencia {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja", "Kiwi", "Manga"};
        int indiceEncontrado = -1;

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals("Laranja")) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("O índice da primeira ocorrência de 'Laranja' é: " + indiceEncontrado);
        } else {
            System.out.println("O elemento 'Laranja' não foi encontrado no array.");
        }
    }
}
