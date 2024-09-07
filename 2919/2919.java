class Solution {
    public int solve2919(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}