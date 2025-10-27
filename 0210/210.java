import java.util.*;
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++) graph.add(new ArrayList<>());
        for(int[] p:prerequisites){graph.get(p[1]).add(p[0]);indegree[p[0]]++;}
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++) if(indegree[i]==0) q.offer(i);
        int[] order=new int[numCourses];int idx=0;
        while(!q.isEmpty()){int c=q.poll();order[idx++]=c;for(int nb:graph.get(c)){if(--indegree[nb]==0)q.offer(nb);}}
        return idx==numCourses?order:new int[]{};
    }
}