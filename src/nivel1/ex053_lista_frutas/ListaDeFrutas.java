package nivel1.ex053_lista_frutas;

public class ListaDeFrutas {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja", "Kiwi", "Manga"};

        if (frutas.length > 0) {
            String ultimaFruta = frutas[frutas.length-1];
            System.out.println("Primeira fruta: " + frutas[0]);
            System.out.println("Última fruta: " + ultimaFruta);
        } else {
            System.out.println("Lista vazia.");
        }
    }
}