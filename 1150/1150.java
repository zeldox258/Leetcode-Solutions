
class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int cnt=0; for(int x:nums) if(x==target) cnt++;
        return cnt>nums.length/2;
    }
}
