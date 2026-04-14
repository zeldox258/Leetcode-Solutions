class Solution {
    public int threeSumClosest(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int l = i+1, r = nums.length-1;
            while (l < r) {
                int s = nums[i]+nums[l]+nums[r];
                if (Math.abs(s-target) < Math.abs(closest-target)) closest = s;
                if (s < target) l++;
                else if (s > target) r--;
                else return s;
            }
        }
        return closest;
    }
}