class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            boolean flag=true;
            if(i-k>=0&&nums[i]<=nums[i-k])flag=false;
            if(i+k<nums.length&&nums[i]<=nums[i+k])flag=false;
            if(flag)sum+=nums[i];
        }
        return sum;
    }
}