import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();q.offer(root);boolean left=true;
        while(!q.isEmpty()){
            int size=q.size();LinkedList<Integer> level=new LinkedList<>();
            for(int i=0;i<size;i++){TreeNode n=q.poll();if(left)level.addLast(n.val);else level.addFirst(n.val);if(n.left!=null)q.offer(n.left);if(n.right!=null)q.offer(n.right);}
            res.add(level);left=!left;
        }
        return res;
    }
}