
import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int[] dp=new int[envelopes.length]; int len=0;
        for (int[] e:envelopes) {
            int pos=Arrays.binarySearch(dp,0,len,e[1]);
            if(pos<0) pos=-(pos+1);
            dp[pos]=e[1]; if(pos==len) len++;
        }
        return len;
    }
}
