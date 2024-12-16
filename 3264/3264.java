class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min=Integer.MAX_VALUE,index=0;
        while(k>0){
            for(int i=0;i<nums.length;i++){
                if(min>nums[i]){
                    min=nums[i];
                    index=i;
                }
            }
            min*=multiplier;
            k--;
            nums[index]=min;
            min=Integer.MAX_VALUE;
        }
        return nums;
    }
}