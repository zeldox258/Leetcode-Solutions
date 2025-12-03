import java.util.*;
class BSTIterator {
    private Deque<TreeNode> stack=new ArrayDeque<>();
    public BSTIterator(TreeNode root){pushLeft(root);}
    public int next(){TreeNode node=stack.pop();pushLeft(node.right);return node.val;}
    public boolean hasNext(){return !stack.isEmpty();}
    private void pushLeft(TreeNode node){while(node!=null){stack.push(node);node=node.left;}}
}