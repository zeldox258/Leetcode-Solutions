import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){TreeNode n=q.poll();level.add(n.val);if(n.left!=null)q.offer(n.left);if(n.right!=null)q.offer(n.right);}
            res.add(level);
        }
        return res;
    }
}