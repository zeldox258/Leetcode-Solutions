class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    int height(TreeNode node){
        if(node==null) return 0;
        int l=height(node.left),r=height(node.right);
        if(l==-1||r==-1||Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }
}