
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        java.util.Arrays.sort(nums); for(int i=0;i<nums.length&&k>0&&nums[i]<0;i++){nums[i]=-nums[i];k--;}
        java.util.Arrays.sort(nums); if(k%2==1)nums[0]=-nums[0]; int s=0; for(int v:nums) s+=v; return s;
    }
}
