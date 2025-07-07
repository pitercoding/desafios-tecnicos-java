package verificar.anagramas;

import java.util.Arrays;
import java.util.Scanner;

public class VerificarAnagramas {
    public static boolean ehAnagrama (String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("==== ANAGRAMA? ==== ");
            System.out.print("Primeira palavra: ");
            String palavra1 = scanner.nextLine();
            System.out.print("Segunda palavra: ");
            String palavra2 = scanner.nextLine();

            System.out.println(palavra1 + " e " + palavra2 + " são anagramas? " + ehAnagrama(palavra1, palavra2));
        } catch (Exception e) {
            System.out.println("[ERRO!] Informe uma palavra válida!");
        } finally {
            scanner.close();
        }
    }
}
