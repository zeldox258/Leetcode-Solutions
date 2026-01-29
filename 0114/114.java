class Solution {
    public void flatten(TreeNode root) {
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left!=null){
                TreeNode rightmost=cur.left;while(rightmost.right!=null)rightmost=rightmost.right;
                rightmost.right=cur.right;cur.right=cur.left;cur.left=null;
            }
            cur=cur.right;
        }
    }
}