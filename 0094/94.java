import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Deque<TreeNode> stack=new ArrayDeque<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){stack.push(cur);cur=cur.left;}
            cur=stack.pop();res.add(cur.val);cur=cur.right;
        }
        return res;
    }
}