
import java.util.*;
class Solution {
    public boolean sequenceReconstruction(int[] nums, int[][] sequences) {
        int n=nums.length;
        int[] indegree=new int[n+1]; List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int[] seq:sequences) for(int i=1;i<seq.length;i++){adj.get(seq[i-1]).add(seq[i]);indegree[seq[i]]++;}
        Queue<Integer> q=new LinkedList<>(); for(int i=1;i<=n;i++) if(indegree[i]==0) q.offer(i);
        while(!q.isEmpty()){if(q.size()>1)return false;int cur=q.poll();for(int nb:adj.get(cur))if(--indegree[nb]==0)q.offer(nb);}
        return true;
    }
}
