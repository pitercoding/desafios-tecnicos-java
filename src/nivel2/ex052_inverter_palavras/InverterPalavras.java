package nivel2.ex052_inverter_palavras;

public class InverterPalavras {
    public static void main(String[] args) {
        String texto = "Olá Mundo Java";

        String[] palavras = texto.split(" ");
        StringBuilder textoInvertido = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            textoInvertido.append(palavras[i]);

            if (i != 0) {
                textoInvertido.append(" ");
            }
        }
        System.out.println(textoInvertido);
    }
}
