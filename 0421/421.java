
class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0,mask=0;
        for(int i=31;i>=0;i--){
            mask|=1<<i; java.util.Set<Integer> set=new java.util.HashSet<>();
            for(int n:nums) set.add(n&mask);
            int tmp=max|1<<i;
            for(int prefix:set) if(set.contains(tmp^prefix)){max=tmp;break;}
        }
        return max;
    }
}
