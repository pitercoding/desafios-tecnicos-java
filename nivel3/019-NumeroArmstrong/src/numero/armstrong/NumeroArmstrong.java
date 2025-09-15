package numero.armstrong;

import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        if (checkArmstrong(numero)) {
            System.out.println("É Armstrong!");
        } else {
            System.out.println("Não é!");
        }
        input.close();
    }

    public static boolean checkArmstrong(int numero) {
        String string = String.valueOf(numero);
        int tamanho = string.length();
        int soma = 0;
        int num;
        for (int i = 0; i < string.length(); i++) {
            num = Integer.parseInt(string.charAt(i) + "");
            soma += Math.pow(num, tamanho);
        }
        if (soma == numero) {
            return true;
        }
        return false;
    }
}