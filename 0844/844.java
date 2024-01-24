
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }
    String process(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) { if (c == '#') { if (sb.length() > 0) sb.deleteCharAt(sb.length()-1); } else sb.append(c); }
        return sb.toString();
    }
}
