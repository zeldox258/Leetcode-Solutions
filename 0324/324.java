
import java.util.*;
class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int[] sorted=nums.clone(); Arrays.sort(sorted);
        int mid=(n-1)/2, end=n-1;
        for (int i=0;i<n;i++) nums[(1+2*i)%(n|1)] = i<=mid?sorted[mid-i]:sorted[end-(i-mid-1)];
    }
}
