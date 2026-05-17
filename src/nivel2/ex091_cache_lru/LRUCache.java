package nivel2.ex091_cache_lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacidade;

    public LRUCache(int capacidade) {
        super(capacidade, 0.75f, true);

        this.capacidade = capacidade;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacidade;
    }
}
