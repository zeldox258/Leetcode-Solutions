
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum=0; for(int v:nums) if(v%2==0) evenSum+=v;
        int[]res=new int[queries.length];
        for(int i=0;i<queries.length;i++){int val=queries[i][0],idx=queries[i][1];if(nums[idx]%2==0)evenSum-=nums[idx];nums[idx]+=val;if(nums[idx]%2==0)evenSum+=nums[idx];res[i]=evenSum;}
        return res;
    }
}
