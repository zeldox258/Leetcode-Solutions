
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList<>(); q.offer(root);
        while(!q.isEmpty()){int sz=q.size();List<Integer> level=new ArrayList<>();for(int i=0;i<sz;i++){Node n=q.poll();level.add(n.val);q.addAll(n.children);}res.add(level);}
        return res;
    }
}
