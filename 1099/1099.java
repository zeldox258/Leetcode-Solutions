
class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        java.util.Arrays.sort(nums);int l=0,r=nums.length-1,res=-1;
        while(l<r){int s=nums[l]+nums[r];if(s<k){res=Math.max(res,s);l++;}else r--;}return res;
    }
}
