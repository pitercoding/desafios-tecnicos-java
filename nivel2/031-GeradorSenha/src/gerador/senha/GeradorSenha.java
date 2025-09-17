package gerador.senha;

import java.util.Random;
import java.util.Scanner;

public class GeradorSenha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Deseja uma senha de quantos digitos? ");
        int tamanho = input.nextInt();
        System.out.println("Sua senha: " + gerarSenha(tamanho));
    }

    public static String gerarSenha(int tamanho){
        StringBuilder senha = new StringBuilder();
        int escolha = -1;
        for(int i = 0; i < tamanho; i++){
            int ultimo = escolha;
            escolha = new Random().nextInt(3);
            if(ultimo != -1 && ultimo == escolha){
                escolha = (escolha == 3) ? 0 : escolha + 1;
            }
            switch(escolha){
                case 0:
                    senha.append(getLetraMaiusculas());
                    break;
                case 1:
                    senha.append(getLetraMinusculas());
                    break;
                case 2:
                    senha.append(getNaoLetra());
                    break;
                case 3:
                    senha.append(getNumero());
                    break;
            }
            System.out.println("oba");
        }
        return senha.toString();
    }

    private static String getLetraMinusculas(){
        String[] letrasMinusculas = {
                "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"
        };
        Random random = new Random();
        return letrasMinusculas[random.nextInt(letrasMinusculas.length)];
    }

    private static String getLetraMaiusculas(){
        String[] letrasMaiusculas = {
                "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z"
        };
        Random random = new Random();
        return letrasMaiusculas[random.nextInt(letrasMaiusculas.length)];
    }

    private static String getNaoLetra(){
        String[] naoLetras = {
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")",
                "-", "_", "=", "+", "[", "]", "{", "}", "\\", "|",
                ";", ":", "'", "\"", ",", ".", "/", "<", ">", "?",
        };
        Random random = new Random();
        return naoLetras[random.nextInt(naoLetras.length)];
    }

    private static String getNumero() {
        String[] numeros = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };
        Random random = new Random();
        return numeros[random.nextInt(numeros.length)];
    }

}
