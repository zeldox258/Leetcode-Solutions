
class MapSum {
    Map<String, Integer> map = new HashMap<>();
    public void insert(String key, int val) { map.put(key, val); }
    public int sum(String prefix) {
        int s = 0;
        for (String k : map.keySet()) if (k.startsWith(prefix)) s += map.get(k);
        return s;
    }
}
