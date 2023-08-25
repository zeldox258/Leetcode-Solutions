
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k){return atMost(nums,k)-atMost(nums,k-1);}
    int atMost(int[]nums,int k){java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();int res=0,l=0;for(int r=0;r<nums.length;r++){cnt.merge(nums[r],1,Integer::sum);while(cnt.size()>k){cnt.merge(nums[l],-1,Integer::sum);if(cnt.get(nums[l])==0)cnt.remove(nums[l]);l++;}res+=r-l+1;}return res;}
}
