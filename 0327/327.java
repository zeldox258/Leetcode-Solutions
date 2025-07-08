
import java.util.*;
class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n=nums.length;
        long[] prefix = new long[n+1];
        for (int i=0;i<n;i++) prefix[i+1]=prefix[i]+nums[i];
        return mergeCount(prefix, 0, n+1, lower, upper);
    }
    int mergeCount(long[] arr, int l, int r, int lo, int hi) {
        if (r-l<=1) return 0;
        int mid=(l+r)/2;
        int cnt=mergeCount(arr,l,mid,lo,hi)+mergeCount(arr,mid,r,lo,hi);
        int j=mid,k=mid;
        for (int i=l;i<mid;i++) {
            while (j<r&&arr[j]-arr[i]<lo) j++;
            while (k<r&&arr[k]-arr[i]<=hi) k++;
            cnt+=k-j;
        }
        long[] tmp=Arrays.copyOfRange(arr,l,r); Arrays.sort(tmp);
        System.arraycopy(tmp,0,arr,l,tmp.length);
        return cnt;
    }
}
