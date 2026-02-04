package nivel2.ex043_reduce_produto_inteiros;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReduceProdutoInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // 1) Usando reduce com identidade
        int produtoComIdentidade = numeros.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println("Produto (com identidade): " + produtoComIdentidade);

        // 2) Usando reduce sem identidade (retorna Optional)
        Optional<Integer> produtoOpcional = numeros.stream()
                .reduce((a,b) -> a * b);
        produtoOpcional.ifPresentOrElse(
                p -> System.out.println("Produto (Optional): " + p),
                () -> System.out.println("Lista vazia — sem produto definido")
        );

        // 3) Exemplo com lista vazia (mostra comportamento com identidade)
        List<Integer> vazia = Collections.emptyList();
        int produtoVazia = vazia.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println("Produto (lista vazia, com identidade): " + produtoVazia);
    }
}
