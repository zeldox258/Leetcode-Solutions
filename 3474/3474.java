class Solution {
    public int solve3474(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);int sum=0,count=0;
        for(int x:nums){
            sum+=x;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}