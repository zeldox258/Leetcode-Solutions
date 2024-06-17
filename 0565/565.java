
class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int start = nums[i], count = 0;
                while (nums[start] != -1) { int tmp=start; start=nums[start]; nums[tmp]=-1; count++; }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
