package nivel1.ex031_dias_semana;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero do dia da semana: ");
        int numero = input.nextInt();
        System.out.println(obterDiaSemana(numero));
    }


    public static String obterDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Número inválido";
        }
    }
}
