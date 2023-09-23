
class Solution {
    public int repeatedNTimes(int[] nums) {
        java.util.Set<Integer> s=new java.util.HashSet<>(); for(int v:nums) if(!s.add(v)) return v; return -1;
    }
}
