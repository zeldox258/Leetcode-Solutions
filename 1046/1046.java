
class Solution {
    public int lastStoneWeight(int[] stones) {
        java.util.PriorityQueue<Integer> pq=new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        for(int s:stones)pq.offer(s); while(pq.size()>1){int a=pq.poll(),b=pq.poll();if(a!=b)pq.offer(a-b);}
        return pq.isEmpty()?0:pq.poll();
    }
}
