
class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null||root.val<val){TreeNode node=new TreeNode(val);node.left=root;return node;}
        root.right=insertIntoMaxTree(root.right,val); return root;
    }
}
