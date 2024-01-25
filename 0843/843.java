
class Solution {
    public String findSecretWord(String[] wordlist, Master master) {
        String[] candidates = wordlist;
        for (int i = 0; i < 10 && candidates.length > 0; i++) {
            String guess = candidates[0];
            int match = master.guess(guess);
            if (match == 6) return guess;
            List<String> next = new ArrayList<>();
            for (String w : candidates) if (countMatch(guess, w) == match) next.add(w);
            candidates = next.toArray(new String[0]);
        }
        return "";
    }
    int countMatch(String a, String b) { int c = 0; for (int i = 0; i < 6; i++) if (a.charAt(i)==b.charAt(i)) c++; return c; }
}
