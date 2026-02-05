package nivel1.ex056_semaforo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("===== Semáforo ======");

        try {
            System.out.print("Informe um número de 1 a 3: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: System.out.println("Vermelho"); break;
                case 2: System.out.println("Amarelo"); break;
                case 3: System.out.println("Verde"); break;
                default: System.out.println("Opção inválida"); break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Apenas números inteiros são permitidos.");
        } finally {
            scanner.close();
        }
    }
}
