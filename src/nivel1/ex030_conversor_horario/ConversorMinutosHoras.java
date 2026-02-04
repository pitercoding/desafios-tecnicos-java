package nivel1.ex030_conversor_horario;

import java.util.Scanner;

public class ConversorMinutosHoras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos minutos deseja converter: ");
        int minutos = input.nextInt();
        System.out.println(converterHorario(minutos));
        input.close();
    }

    public static String converterHorario(int minutos) {
        int hora = minutos / 60;
        int dias = 0;
        if (hora > 23) {
            dias = hora / 24;
            hora = hora % 24;
        }
        int minuto = minutos % 60;
        if (dias > 0) {
            return String.format("%d %s, %02d:%02d", dias, (dias == 1 ? "dia" : "dias"), hora, minuto);
        }
        return String.format("%02d:%02d", hora, minuto);
    }
}
