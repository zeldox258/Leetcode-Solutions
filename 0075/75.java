class Solution {
    public void sortColors(int[] nums) {
        int lo=0,mid=0,hi=nums.length-1;
        while(mid<=hi){
            if(nums[mid]==0){int t=nums[lo];nums[lo++]=nums[mid];nums[mid++]=t;}
            else if(nums[mid]==1) mid++;
            else{int t=nums[mid];nums[mid]=nums[hi];nums[hi--]=t;}
        }
    }
}