class Solution {
    TreeNode first,second,prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int t=first.val;first.val=second.val;second.val=t;
    }
    void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        if(prev!=null&&prev.val>node.val){if(first==null)first=prev;second=node;}
        prev=node;
        inorder(node.right);
    }
}