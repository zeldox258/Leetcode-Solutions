class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){int t=max;max=min;min=t;}
            max=Math.max(nums[i],max*nums[i]);min=Math.min(nums[i],min*nums[i]);res=Math.max(res,max);
        }
        return res;
    }
}