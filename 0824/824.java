
class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (vowels.contains(w.charAt(0))) w = w + "ma";
            else w = w.substring(1) + w.charAt(0) + "ma";
            for (int j = 0; j <= i; j++) w += "a";
            if (i > 0) sb.append(" ");
            sb.append(w);
        }
        return sb.toString();
    }
}
