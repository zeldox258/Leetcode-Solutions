
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res=0,odd=0,cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int n:nums){
            if(n%2==1) odd++;
            res+=map.getOrDefault(odd-k,0);
            map.merge(odd,1,Integer::sum);
        }
        return res;
    }
}
