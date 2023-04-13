
class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int n=nums.length,res=0;
        int[] res2={0,0};
        for(int i=0;i<n;i++){
            int lo=nums[i];
            if(i>0) lo=Math.min(lo,nums[i-1]);
            if(i<n-1) lo=Math.min(lo,nums[i+1]);
            res2[i%2]+=nums[i]-lo+1;
        }
        return Math.min(res2[0],res2[1]);
    }
}
