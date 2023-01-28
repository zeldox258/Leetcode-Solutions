
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        TreeMap<Integer,Integer> cnt=new TreeMap<>();
        for(int n:nums) cnt.merge(n,1,Integer::sum);
        while(!cnt.isEmpty()){
            int first=cnt.firstKey();
            for(int i=0;i<k;i++){
                int key=first+i;
                if(!cnt.containsKey(key)) return false;
                cnt.merge(key,-1,Integer::sum);
                if(cnt.get(key)==0) cnt.remove(key);
            }
        }
        return true;
    }
}
