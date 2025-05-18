
import java.util.*;
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums1.length==0||nums2.length==0) return res;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<Math.min(k,nums1.length);i++) pq.offer(new int[]{nums1[i]+nums2[0],i,0});
        while(!pq.isEmpty()&&res.size()<k){
            int[] cur=pq.poll(); int i=cur[1],j=cur[2];
            res.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length) pq.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
        }
        return res;
    }
}
