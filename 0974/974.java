
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[]cnt=new int[k]; cnt[0]=1; int sum=0,res=0;
        for(int v:nums){sum=((sum+v)%k+k)%k;res+=cnt[sum]++;} return res;
    }
}
