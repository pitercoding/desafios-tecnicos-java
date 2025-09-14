package calcular.media.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularMediaLista {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite vários números para descobrir a média!");
        System.out.println("Para parar de digitar, escreva um caractere não numérico!");
        double num;
        while (true) {
            String linha = input.nextLine();
            if (linha.isEmpty()) break;
            try {
                num = Double.parseDouble(linha);
                lista.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, digite um número!");
            }
        }
        input.close();
        double media = calcularMedia(lista);
        System.out.printf("Média: %.2f%n", media);
    }

    public static double calcularMedia(ArrayList<Double> lista) {
        if (lista.isEmpty()) return 0;
        double soma = lista.stream().mapToDouble(Double::doubleValue).sum();
        double media = soma / lista.size();
        return media;
    }
}