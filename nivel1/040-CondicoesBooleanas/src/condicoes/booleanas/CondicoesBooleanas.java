package condicoes.booleanas;

import java.util.Scanner;

public class CondicoesBooleanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Está chovendo? (sim/não): ");
        String chovendo = scanner.nextLine().trim().toLowerCase();
        System.out.print("Vai passear com o cachorro? (sim/não): ");
        String passearComOCachorro = scanner.nextLine().trim().toLowerCase();

        // Normaliza "não" com acento
        if (chovendo.equals("não")) { chovendo = "nao"; }
        if (passearComOCachorro.equals("não")) { passearComOCachorro = "nao"; }

        // Converte respostas em booleanos
        boolean estaChovendo = chovendo.equals("sim") || chovendo.equals("s");
        boolean vaiPassearComCachorro = passearComOCachorro.equals("sim") || passearComOCachorro.equals("s");

        // Resultado usando operador ternário (&& e || ) e operadores lógicos (? :)
        String resultado = (estaChovendo && vaiPassearComCachorro) ? "Ambas as condições são verdadeiras."
                : (estaChovendo || vaiPassearComCachorro) ? "Apenas uma condição é verdadeira."
                : "Nenhuma das condições é verdadeira.";

        System.out.println(resultado);

        scanner.close();
    }
}
