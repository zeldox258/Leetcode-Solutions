class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] t = new int[101];

        for (int i : nums) {
            t[i]++;
            if (t[i] > 2) return false;
        }

        return true;
    }
}