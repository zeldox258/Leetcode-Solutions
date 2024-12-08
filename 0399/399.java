
import java.util.*;
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Map<String,Double>> graph=new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String a=equations.get(i).get(0),b=equations.get(i).get(1);
            graph.computeIfAbsent(a,k->new HashMap<>()).put(b,values[i]);
            graph.computeIfAbsent(b,k->new HashMap<>()).put(a,1.0/values[i]);
        }
        double[] res=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String s=queries.get(i).get(0),t=queries.get(i).get(1);
            if(!graph.containsKey(s)||!graph.containsKey(t)){res[i]=-1;continue;}
            res[i]=bfs(graph,s,t);
        }
        return res;
    }
    double bfs(Map<String,Map<String,Double>> graph, String s, String t){
        if(!graph.containsKey(s)) return -1;
        if(s.equals(t)) return 1;
        Queue<String> q=new LinkedList<>(); Map<String,Double> dist=new HashMap<>();
        q.offer(s); dist.put(s,1.0);
        while(!q.isEmpty()){
            String cur=q.poll();
            for(Map.Entry<String,Double> e:graph.get(cur).entrySet()){
                if(!dist.containsKey(e.getKey())){dist.put(e.getKey(),dist.get(cur)*e.getValue());q.offer(e.getKey());}
            }
        }
        return dist.getOrDefault(t,-1.0);
    }
}
