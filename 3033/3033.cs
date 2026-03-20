public class Solution {
    public int ModifyTheMatrix(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ModifyTheMatrix(root.left), ModifyTheMatrix(root.right));
    }
}