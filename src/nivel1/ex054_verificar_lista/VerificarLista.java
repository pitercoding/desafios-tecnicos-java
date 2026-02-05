package nivel1.ex054_verificar_lista;

public class VerificarLista {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 4, 6};

        if(numeros.length > 0) {
            System.out.println("A lista possui " + numeros.length + " elementos.");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
