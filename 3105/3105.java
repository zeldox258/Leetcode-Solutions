class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incl=1; int decl=1; int maxl=1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                incl++;
                decl=1;
            }else if(nums[i+1]<nums[i]){
                decl++;
                incl=1;
            }else{
                incl=1;
                decl=1;
            }  maxl= Math.max(maxl,Math.max(incl,decl));
        }
        return maxl;
    }
}