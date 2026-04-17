package nivel1.ex099_maior_de_idade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Informe sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0  || idade > 120) {
                System.out.println("Idade Inválida! Informe um valor entre 0 e 120.");
                return;
            }

            if(ehMaiorDeIdade(idade)){
                System.out.println("Maior de idade!");
            } else {
                System.out.println("Menor de idade!");
            }
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Somente números inteiros são aceitos!");
        }
    }

    private static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }
}
