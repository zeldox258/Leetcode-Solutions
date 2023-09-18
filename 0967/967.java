
class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        if(n==1){for(int d=0;d<=9;d++) res.add(d);}
        else{ java.util.Queue<Integer> q=new java.util.LinkedList<>(); for(int d=1;d<=9;d++) q.offer(d);
            for(int i=1;i<n;i++){int sz=q.size();while(sz-->0){int v=q.poll(),last=v%10;if(last+k<=9)q.offer(v*10+last+k);if(k!=0&&last-k>=0)q.offer(v*10+last-k);}} res.addAll(q); }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
