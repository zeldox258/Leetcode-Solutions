class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] a=new int[51];
        int x=0;
        for(int i:nums){
            if(a[i]==1)
                x^=i;
            else
                a[i]+=1;
        }
        return x;
    }
}