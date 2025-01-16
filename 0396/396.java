
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length,sum=0,f=0;
        for(int i=0;i<n;i++){sum+=nums[i];f+=i*nums[i];}
        int res=f;
        for(int i=1;i<n;i++){f+=sum-n*nums[n-i];res=Math.max(res,f);}
        return res;
    }
}
