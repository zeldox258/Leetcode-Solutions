
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];
        for (char c : licensePlate.toCharArray()) if (Character.isLetter(c)) need[Character.toLowerCase(c) - 'a']++;
        String res = null;
        for (String w : words) {
            int[] cnt = new int[26]; for (char c : w.toCharArray()) cnt[c - 'a']++;
            boolean ok = true; for (int i = 0; i < 26; i++) if (cnt[i] < need[i]) { ok = false; break; }
            if (ok && (res == null || w.length() < res.length())) res = w;
        }
        return res;
    }
}
