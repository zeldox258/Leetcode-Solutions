
class Solution {
    public int maxEqualFreq(int[] nums) {
        Map<Integer,Integer> cnt=new HashMap<>(),freq=new HashMap<>();
        int maxFreq=0,res=0;
        for(int i=0;i<nums.length;i++){
            cnt.merge(nums[i],1,Integer::sum);
            int cf=cnt.get(nums[i]);
            freq.merge(cf-1,-1,Integer::sum); if(freq.getOrDefault(cf-1,0)<=0) freq.remove(cf-1);
            freq.merge(cf,1,Integer::sum);
            maxFreq=Math.max(maxFreq,cf);
            int n=i+1;
            if(maxFreq==1||maxFreq*freq.getOrDefault(maxFreq,0)==n-1||maxFreq*(freq.getOrDefault(maxFreq,0)+1)==n||(maxFreq+1)*freq.getOrDefault(maxFreq,0)==n)
                res=n;
        }
        return res;
    }
}
