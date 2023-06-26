
class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>(); for(int v:barcodes)cnt.merge(v,1,Integer::sum);
        java.util.PriorityQueue<int[]> pq=new java.util.PriorityQueue<>((a,b)->b[1]-a[1]); for(java.util.Map.Entry<Integer,Integer> e:cnt.entrySet())pq.offer(new int[]{e.getKey(),e.getValue()});
        int[]res=new int[barcodes.length];int i=0;int[]prev=null;
        while(!pq.isEmpty()){int[]a=pq.poll();res[i++]=a[0];if(prev!=null&&prev[1]>0)pq.offer(prev);if(a[1]-1>0)prev=new int[]{a[0],a[1]-1};else prev=null;}
        if(prev!=null&&prev[1]>0&&i<res.length)res[i]=prev[0]; return res;
    }
}
