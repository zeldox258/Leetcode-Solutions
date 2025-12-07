class Solution {
    public int majorityElement(int[] nums) {
        int count=0,candidate=0;
        for(int n:nums){if(count==0)candidate=n;count+=n==candidate?1:-1;}
        return candidate;
    }
}