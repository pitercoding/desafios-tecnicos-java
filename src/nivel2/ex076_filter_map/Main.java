package nivel2.ex076_filter_map;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto("Mouse", 50),
                new Produto("Teclado", 120),
                new Produto("Monitor", 900),
                new Produto("Cabo HDMI", 40)
        );

        List<String> produtosAcimaDeCem = produtos.stream()
                .filter(p -> p.getPreco() >= 100)
                .map(Produto::getNome)
                .toList();

        System.out.println(produtosAcimaDeCem);
    }
}
