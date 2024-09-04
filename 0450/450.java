
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val) root.left=deleteNode(root.left,key);
        else if(key>root.val) root.right=deleteNode(root.right,key);
        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            TreeNode min=root.right; while(min.left!=null) min=min.left;
            root.val=min.val; root.right=deleteNode(root.right,min.val);
        }
        return root;
    }
}
