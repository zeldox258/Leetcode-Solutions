class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) if (n != val) nums[k++] = n;
        return k;
    }
}