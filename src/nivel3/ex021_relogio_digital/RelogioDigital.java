package nivel3.ex021_relogio_digital;

import java.util.Scanner;

public class RelogioDigital {
    private int hora;
    private int minuto;
    private int segundo;

    public RelogioDigital(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void start() {
        System.out.println("=== Relogio Digital ===");
        while (true) {
            segundo++;
            if(segundo == 60){
                segundo = 0;
                minuto++;
            }
            if(minuto == 60){
                minuto = 0;
                hora++;
            }
            if(hora == 24){
                hora = 0;
                minuto = 0;
                segundo = 0;
            }

            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a hora:");
        int hora = input.nextInt();
        System.out.println("Digite a Minuto:");
        int minuto = input.nextInt();
        System.out.println("Digite a Segundo:");
        int segundo = input.nextInt();
        hora = hora > 23 ? 0 : hora;
        minuto = minuto > 59 ? 0 : minuto;
        segundo = segundo > 59 ? 0 : segundo;
        RelogioDigital relogio = new RelogioDigital(hora, minuto, segundo);
        relogio.start();
    }
}
