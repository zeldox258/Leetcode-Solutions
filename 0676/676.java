
class MagicDictionary {
    Set<String> words = new HashSet<>();
    public void buildDict(String[] dictionary) { for (String w : dictionary) words.add(w); }
    public boolean search(String searchWord) {
        for (String w : words) {
            if (w.length() != searchWord.length()) continue;
            int diff = 0;
            for (int i = 0; i < w.length(); i++) if (w.charAt(i) != searchWord.charAt(i)) diff++;
            if (diff == 1) return true;
        }
        return false;
    }
}
