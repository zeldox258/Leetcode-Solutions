import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Deque<TreeNode> stack=new ArrayDeque<>();
        if(root!=null) stack.push(root);
        while(!stack.isEmpty()){TreeNode n=stack.pop();res.add(n.val);if(n.right!=null)stack.push(n.right);if(n.left!=null)stack.push(n.left);}
        return res;
    }
}