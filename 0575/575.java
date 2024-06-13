
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int c : candyType) types.add(c);
        return Math.min(types.size(), candyType.length / 2);
    }
}
