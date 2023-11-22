
class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String min = s;
            for (int i = 1; i < s.length(); i++) { String rot = s.substring(i) + s.substring(0, i); if (rot.compareTo(min) < 0) min = rot; }
            return min;
        }
        char[] ch = s.toCharArray(); Arrays.sort(ch); return new String(ch);
    }
}
