
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int cnt = 1;
        while (sb.length() < b.length()) { sb.append(a); cnt++; }
        if (sb.toString().contains(b)) return cnt;
        sb.append(a);
        if (sb.toString().contains(b)) return cnt + 1;
        return -1;
    }
}
