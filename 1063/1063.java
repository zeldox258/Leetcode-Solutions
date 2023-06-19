
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res=0,dp=0,last=-1;
        for(int i=0;i<nums.length;i++){if(nums[i]>right){dp=0;last=i;}else if(nums[i]>=left){dp=i-last;}res+=dp;}
        return res;
    }
}
