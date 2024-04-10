
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) freq.put(w, freq.getOrDefault(w, 0) + 1);
        List<String> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(a).equals(freq.get(b)) ? a.compareTo(b) : freq.get(b) - freq.get(a));
        return keys.subList(0, k);
    }
}
