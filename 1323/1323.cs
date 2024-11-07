public class Solution {
    public int Maximum69Number(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(Maximum69Number(root.left), Maximum69Number(root.right));
    }
}