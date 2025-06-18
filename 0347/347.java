
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for (int n:nums) freq.merge(n,1,Integer::sum);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.comparingInt(freq::get));
        for (int key:freq.keySet()) { pq.offer(key); if(pq.size()>k) pq.poll(); }
        int[] res=new int[k];
        for (int i=k-1;i>=0;i--) res[i]=pq.poll();
        return res;
    }
}
