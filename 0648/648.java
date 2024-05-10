
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> roots = new HashSet<>(dictionary);
        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (sb.length() > 0) sb.append(' ');
            String replace = word;
            for (int i = 1; i <= word.length(); i++) {
                if (roots.contains(word.substring(0, i))) { replace = word.substring(0, i); break; }
            }
            sb.append(replace);
        }
        return sb.toString();
    }
}
