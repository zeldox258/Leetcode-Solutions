
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int res=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null) res+=root.left.val;
        else res+=sumOfLeftLeaves(root.left);
        res+=sumOfLeftLeaves(root.right);
        return res;
    }
}
