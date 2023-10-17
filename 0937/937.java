
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        java.util.Arrays.sort(logs, (a, b) -> {
            String[] pa = a.split(" ", 2), pb = b.split(" ", 2);
            boolean da = Character.isDigit(pa[1].charAt(0)), db = Character.isDigit(pb[1].charAt(0));
            if (!da && !db) { int c = pa[1].compareTo(pb[1]); return c != 0 ? c : pa[0].compareTo(pb[0]); }
            if (!da) return -1; if (!db) return 1; return 0;
        });
        return logs;
    }
}
