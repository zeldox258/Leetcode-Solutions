public class Solution {
    public int LogicalOrOfTwoBinaryGridsRepre(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LogicalOrOfTwoBinaryGridsRepre(root.left), LogicalOrOfTwoBinaryGridsRepre(root.right));
    }
}