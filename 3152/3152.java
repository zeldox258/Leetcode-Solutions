class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length,len=queries.length;
        int[] badIndex=new int[n];
        boolean[] ans=new boolean[len];
        for(int i=1;i<n;i++){
            if((nums[i-1]&1)==(nums[i]&1)) badIndex[i]=1;
            badIndex[i]+=badIndex[i-1];
        }
        for(int i=0;i<len;i++)
            ans[i]=(badIndex[queries[i][1]]-badIndex[queries[i][0]])==0;
        return ans;
    }
}