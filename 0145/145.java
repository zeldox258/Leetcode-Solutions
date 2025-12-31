import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        Deque<TreeNode> stack=new ArrayDeque<>();
        if(root!=null) stack.push(root);
        while(!stack.isEmpty()){TreeNode n=stack.pop();res.addFirst(n.val);if(n.left!=null)stack.push(n.left);if(n.right!=null)stack.push(n.right);}
        return res;
    }
}