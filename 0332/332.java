
import java.util.*;
class Solution {
    Map<String,PriorityQueue<String>> graph=new HashMap<>();
    List<String> res=new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> t:tickets)
            graph.computeIfAbsent(t.get(0),k->new PriorityQueue<>()).offer(t.get(1));
        dfs("JFK");
        Collections.reverse(res);
        return res;
    }
    void dfs(String airport) {
        PriorityQueue<String> pq=graph.get(airport);
        while (pq!=null&&!pq.isEmpty()) dfs(pq.poll());
        res.add(airport);
    }
}
