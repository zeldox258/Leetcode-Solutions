
class LFUCache {
    int cap, minFreq;
    Map<Integer, Integer> keyVal, keyFreq;
    Map<Integer, LinkedHashSet<Integer>> freqKeys;
    public LFUCache(int capacity) {
        cap = capacity; minFreq = 0;
        keyVal = new HashMap<>(); keyFreq = new HashMap<>(); freqKeys = new HashMap<>();
    }
    public int get(int key) {
        if (!keyVal.containsKey(key)) return -1;
        updateFreq(key);
        return keyVal.get(key);
    }
    public void put(int key, int value) {
        if (cap <= 0) return;
        if (keyVal.containsKey(key)) { keyVal.put(key, value); updateFreq(key); return; }
        if (keyVal.size() >= cap) {
            LinkedHashSet<Integer> minSet = freqKeys.get(minFreq);
            int evict = minSet.iterator().next();
            minSet.remove(evict); keyVal.remove(evict); keyFreq.remove(evict);
        }
        keyVal.put(key, value); keyFreq.put(key, 1);
        freqKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }
    void updateFreq(int key) {
        int f = keyFreq.get(key); keyFreq.put(key, f + 1);
        freqKeys.get(f).remove(key);
        if (freqKeys.get(f).isEmpty() && f == minFreq) minFreq++;
        freqKeys.computeIfAbsent(f + 1, k -> new LinkedHashSet<>()).add(key);
    }
}
