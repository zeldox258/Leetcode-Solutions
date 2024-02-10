
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> cnt = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        for (String w : words) if (!ban.contains(w)) cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        return Collections.max(cnt.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
