
class Solution {
    public int[][] highFive(int[][] items) {
        java.util.Map<Integer,java.util.PriorityQueue<Integer>> map=new java.util.HashMap<>();
        for(int[]item:items) map.computeIfAbsent(item[0],k->new java.util.PriorityQueue<>()).offer(item[1]);
        for(java.util.Map.Entry<Integer,java.util.PriorityQueue<Integer>> e:map.entrySet()){java.util.PriorityQueue<Integer>pq=e.getValue();while(pq.size()>5)pq.poll();}
        int[][]res=new int[map.size()][2]; int i=0;
        java.util.TreeMap<Integer,java.util.PriorityQueue<Integer>> sorted=new java.util.TreeMap<>(map);
        for(java.util.Map.Entry<Integer,java.util.PriorityQueue<Integer>> e:sorted.entrySet()){int sum=0;for(int v:e.getValue())sum+=v;res[i++]=new int[]{e.getKey(),sum/5};}
        return res;
    }
}
