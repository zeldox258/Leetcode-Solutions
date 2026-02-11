class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    boolean isMirror(TreeNode l, TreeNode r) {
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        return l.val==r.val&&isMirror(l.left,r.right)&&isMirror(l.right,r.left);
    }
}