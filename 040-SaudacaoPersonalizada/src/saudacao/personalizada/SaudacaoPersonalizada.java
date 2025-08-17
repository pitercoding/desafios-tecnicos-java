package saudacao.personalizada;

public class SaudacaoPersonalizada {
    public static String criarSaudacao(String texto) {
        return "Olá, " + texto + "!";
    }

    public static void main(String[] args) {
        String resultado = criarSaudacao("Maria");
        System.out.println(resultado);
    }
}
