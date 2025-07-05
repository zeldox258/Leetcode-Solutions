
class Solution {
    public int minPatches(int[] nums, long n) {
        long miss=1; int i=0, patches=0;
        while (miss<=n) {
            if (i<nums.length&&nums[i]<=miss) miss+=nums[i++];
            else { miss*=2; patches++; }
        }
        return patches;
    }
}
