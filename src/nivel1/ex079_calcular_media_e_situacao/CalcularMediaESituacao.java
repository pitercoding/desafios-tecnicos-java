package nivel1.ex079_calcular_media_e_situacao;

import java.util.ArrayList;

public class CalcularMediaESituacao {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(6.0);
        notas.add(7.0);

        double media = notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.printf("Média do aluno: %.2f%n", media);
        if (media >= 7.0) System.out.println("Situação: Aprovado");
        else System.out.println("Situação: Recuperação");
    }
}
