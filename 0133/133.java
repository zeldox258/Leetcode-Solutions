import java.util.*;
class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node,Node> map=new HashMap<>();
        return dfs(node,map);
    }
    Node dfs(Node node,Map<Node,Node> map){
        if(map.containsKey(node)) return map.get(node);
        Node clone=new Node(node.val);map.put(node,clone);
        for(Node nb:node.neighbors) clone.neighbors.add(dfs(nb,map));
        return clone;
    }
}