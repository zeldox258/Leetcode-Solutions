class Solution {
    int result = 0;
    int total = 0;
    public int findTargetSumWays(int[] nums, int S) {
        finder(nums,S,0,0);
        total = 0;
        finder(nums,S,0,1);
        return result/2;
    }

    public void finder(int[] nums,int target,int i,int sign){
        if(i == nums.length){
            //System.out.println(total);
            if(total == target) result++;
            return;
        }
        if(sign == 1)total += nums[i];
        else total -=nums[i];

        finder(nums,target,i+1,1);
        finder(nums,target,i+1,0);

        if(sign == 1)total -= nums[i];
        else total += nums[i];

    }
}