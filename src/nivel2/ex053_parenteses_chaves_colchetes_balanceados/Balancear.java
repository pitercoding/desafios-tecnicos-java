package nivel2.ex053_parenteses_chaves_colchetes_balanceados;

import java.util.Stack;

public class Balancear {
    public static void main(String[] args) {
        String expressao = "({[]})";

        Stack<Character> pilha = new Stack<>();
        
        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.isEmpty()) {
                    System.out.println("Não balanceado");
                    return;
                }

                char topo = pilha.pop();

                if ((c == ')' && topo != '(') ||
                        (c == '}' && topo != '{') ||
                        (c == ']' && topo != '[')) {

                    System.out.println("Não balanceado");
                    return;
                }
            }
        }
        if (pilha.isEmpty()) {
            System.out.println("Balanceado");
        } else {
            System.out.println("Não balanceado");
        }
    }
}
