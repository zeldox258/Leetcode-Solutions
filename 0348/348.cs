public class Solution {
    public int DesignTictactoe(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DesignTictactoe(root.left), DesignTictactoe(root.right));
    }
}