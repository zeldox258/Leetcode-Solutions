class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;for(int n:nums) xor^=n;
        int bit=xor&(-xor);int a=0,b=0;
        for(int n:nums){if((n&bit)!=0)a^=n;else b^=n;}
        return new int[]{a,b};
    }
}