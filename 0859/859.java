
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        List<Integer> diff = new ArrayList<>();
        int[] cnt = new int[26];
        boolean hasDup = false;
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            if (cnt[s.charAt(i) - 'a'] == 2) hasDup = true;
            if (s.charAt(i) != goal.charAt(i)) diff.add(i);
        }
        if (diff.size() == 0) return hasDup;
        if (diff.size() == 2) return s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
        return false;
    }
}
