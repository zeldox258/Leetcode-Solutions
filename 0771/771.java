
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) set.add(c);
        int cnt = 0; for (char c : stones.toCharArray()) if (set.contains(c)) cnt++;
        return cnt;
    }
}
