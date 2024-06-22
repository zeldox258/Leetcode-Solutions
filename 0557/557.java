
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(new StringBuilder(word).reverse());
        }
        return sb.toString();
    }
}
