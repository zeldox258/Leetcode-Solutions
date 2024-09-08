
import java.util.*;
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length, res=0;
        Map<Long,Integer>[] dp=new HashMap[n];
        for(int i=0;i<n;i++) dp[i]=new HashMap<>();
        for(int i=1;i<n;i++) for(int j=0;j<i;j++){
            long diff=(long)nums[i]-nums[j]; int cnt=dp[j].getOrDefault(diff,0);
            dp[i].merge(diff,cnt+1,Integer::sum); res+=cnt;
        }
        return res;
    }
}
