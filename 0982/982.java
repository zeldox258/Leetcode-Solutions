
class Solution {
    public int countTriplets(int[] nums) {
        int res=0; java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for(int a:nums) for(int b:nums) cnt.merge(a&b,1,Integer::sum);
        for(int a:nums) for(java.util.Map.Entry<Integer,Integer> e:cnt.entrySet()) if((a&e.getKey())==0) res+=e.getValue();
        return res;
    }
}
