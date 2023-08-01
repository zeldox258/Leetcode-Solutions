
class Solution {
    public java.util.List<Integer> prefixesDivBy5(int[] nums) {
        java.util.List<Integer> res=new java.util.ArrayList<>(); int cur=0; for(int v:nums){cur=((cur<<1)|v)%5;res.add(cur==0?1:0);} return res;
    }
}
