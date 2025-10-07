class Solution {
    int k,res;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;inorder(root);return res;
    }
    void inorder(TreeNode node){if(node==null)return;inorder(node.left);if(--k==0)res=node.val;inorder(node.right);}
}