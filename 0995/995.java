
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n=nums.length,flips=0,res=0; int[]hint=new int[n];
        for(int i=0;i<n;i++){flips+=hint[i];if((nums[i]+flips)%2==0){if(i+k>n)return -1;flips++;res++;if(i+k<n)hint[i+k]--;}}
        return res;
    }
}
