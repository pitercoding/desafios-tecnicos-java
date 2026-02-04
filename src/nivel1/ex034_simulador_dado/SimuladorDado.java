package nivel1.ex034_simulador_dado;

import java.util.Random;

public class SimuladorDado {

    public static void main(String[] args) {
        System.out.println("Número do dado: " + jogarDado());
    }



    public static int jogarDado(){
        int[] dado = {1,2,3,4,5,6};
        Random random = new Random();
        int index = random.nextInt(dado.length);
        return dado[index];
    }

}
