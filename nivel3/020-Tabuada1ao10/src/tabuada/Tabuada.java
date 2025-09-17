package tabuada;

public class Tabuada {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("===============");
            gerarTabuada(i);
        }
    }

    public static void gerarTabuada(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, (num * i));
        }
    }
}
