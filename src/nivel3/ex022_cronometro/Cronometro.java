package nivel3.ex022_cronometro;

import java.util.Scanner;

public class Cronometro {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Quer um contador de quantos segundos? ");
        int segundos =  input.nextInt();
        iniciarCronometro(segundos);
    }

    public static void iniciarCronometro(int segundos) throws InterruptedException {
        int segundosContador = 0;
        while(true){
            System.out.println(formatarHorario(segundosContador));
            segundosContador++;
            Thread.sleep(1000);
            if(segundosContador > segundos){
                break;
            }
        }
        System.out.println("FIM!");
    }

    private static String formatarHorario(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segs = segundos % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segs);
    }
}
