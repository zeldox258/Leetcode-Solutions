
import java.util.*;
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        dfs(root); return res;
    }
    int dfs(TreeNode node){
        if(node==null) return -1;
        int l=dfs(node.left),r=dfs(node.right),h=Math.max(l,r)+1;
        if(res.size()==h) res.add(new ArrayList<>());
        res.get(h).add(node.val); return h;
    }
}
