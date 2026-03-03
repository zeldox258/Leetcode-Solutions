class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int n:nums) if(k<2||nums[k-2]!=n) nums[k++]=n;
        return k;
    }
}