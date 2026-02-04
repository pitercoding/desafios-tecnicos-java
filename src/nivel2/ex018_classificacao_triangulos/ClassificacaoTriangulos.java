/* Crie uma função que recebe os comprimentos dos três lados de um triângulo
/* e retorne sua classificação quanto ao tamanho de seus lados.
*/
package nivel2.ex018_classificacao_triangulos;

import java.util.Scanner;

public class ClassificacaoTriangulos {

    public static void definirTipoDeTriangulo(double l1, double l2, double l3) {
        // Verificação de existência do triângulo
        if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
            System.out.println("ERRO! Impossível formar um triângulo.");
            return;
        }

        // Classificação
        if (l1 == l2 && l2 == l3) {
            System.out.println("Triângulo Equilátero formado!");
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            System.out.println("Triângulo Isósceles formado!");
        } else {
            System.out.println("Triângulo Escaleno formado!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro lado: ");
        double l1 = scanner.nextDouble();
        System.out.print("Informe o segundo lado: ");
        double l2 = scanner.nextDouble();
        System.out.print("Informe o terceiro lado: ");
        double l3 = scanner.nextDouble();

        definirTipoDeTriangulo(l1, l2, l3);

        scanner.close();
    }
}
