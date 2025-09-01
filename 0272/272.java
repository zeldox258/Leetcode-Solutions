import java.util.*;
class Solution {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        LinkedList<Integer> res=new LinkedList<>();
        inorder(root,target,k,res);
        return res;
    }
    void inorder(TreeNode node,double target,int k,LinkedList<Integer> res){
        if(node==null) return;
        inorder(node.left,target,k,res);
        if(res.size()==k){if(Math.abs(node.val-target)>=Math.abs(res.getFirst()-target))return;else res.removeFirst();}
        res.addLast(node.val);
        inorder(node.right,target,k,res);
    }
}