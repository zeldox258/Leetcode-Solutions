
class Solution {
    public int sumOfDigits(int[] nums) {
        int min=nums[0]; for(int v:nums) min=Math.min(min,v);
        int s=0; while(min>0){s+=min%10;min/=10;} return s%2==0?1:0;
    }
}
