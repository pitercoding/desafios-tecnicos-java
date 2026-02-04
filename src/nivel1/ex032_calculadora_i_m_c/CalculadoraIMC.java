package nivel1.ex032_calculadora_i_m_c;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static  void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        input.useLocale(Locale.forLanguageTag("pt-BR"));
        System.out.print("Digite seu peso: (kg) ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: (m) ");
        double altura = input.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.printf("Seu IMC: %.3f%n", imc);
        System.out.println(classificarIMC(imc));
        input.close();
    }


    public static String classificarIMC(double imc) {
        if(imc < 18.5){
            return "Magreza";
        }else if(imc < 25 ){
            return "Normal";
        }else if(imc < 30){
            return "Sobrepeso";
        }else if(imc < 40){
            return "Obesidade";
        }else{
            return "Obesidade Grave";
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
