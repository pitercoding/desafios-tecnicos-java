package nivel1.ex084_calcular_perimetro_do_quadrado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerimetroDoQuadrado {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("=== Calculadora do Perímetro de Quadrado ===");

            System.out.println("Digite o valor de um lado do quadrado: ");
            double valorDeUmLadoDoQuadrado = input.nextDouble();

            System.out.println("Se um lado do quadrado equivale a " + valorDeUmLadoDoQuadrado +
                    ", seu perímetro é de: " + calcularPerimetroDoQuadrado(valorDeUmLadoDoQuadrado));

        } catch(InputMismatchException ex){
            System.out.println("[ERRO] Apenas valores numéricos são aceitos!");
        }
    }

    private static double calcularPerimetroDoQuadrado(double valorDeUmLadoDoQuadrado){
        return valorDeUmLadoDoQuadrado * 4;
    }
}
