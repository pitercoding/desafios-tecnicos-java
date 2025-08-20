package divisao;

public class DivisaoService {
    public int calcularResultado(Divisao divisao) {
        return divisao.getDividendo() / divisao.getDivisor();
    }

    public int calcularResto(Divisao divisao) {
        return divisao.getDividendo() % divisao.getDivisor();
    }
}
