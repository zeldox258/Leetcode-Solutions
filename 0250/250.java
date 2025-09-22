class Solution {
    int res=0;
    public int countUnivalSubtrees(TreeNode root) {
        isUni(root);return res;
    }
    boolean isUni(TreeNode node){
        if(node==null) return true;
        boolean l=isUni(node.left),r=isUni(node.right);
        if(!l||!r) return false;
        if(node.left!=null&&node.left.val!=node.val) return false;
        if(node.right!=null&&node.right.val!=node.val) return false;
        res++;return true;
    }
}