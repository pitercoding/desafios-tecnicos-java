package nivel2.ex029_gerador_mega_sena;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Gerador {

    public static void main(String[] args){
        System.out.println("Simples: " + gerarSimples());
        System.out.println("===");
        System.out.println("Ordenado: " + gerarOrdenado());
    }


    public static String gerarSimples(){
        String numero = "";
        int cont = 0;
        Random random = new Random();
        while(cont < 6){
            int numeroTemporario = random.nextInt(59) + 1;
            if(!numero.contains(Integer.toString(numeroTemporario))){
                numero += numeroTemporario  + ", ";
                cont++;
            }
        }
        numero = numero.substring(0, numero.length() - 2);
        return numero;
    }

    public static String gerarOrdenado(){
        Random random = new Random();
        Set<Integer> numeros = new TreeSet<>();

        while(numeros.size() < 6){
            int numeroTemporario = random.nextInt(59) + 1;
            numeros.add(numeroTemporario);
        }

        StringBuilder sb = new StringBuilder();

        for(int numero: numeros){
            sb.append(numero).append(", ");
        }
        sb.setLength(sb.length()-2);
        return sb.toString();
    }
}
