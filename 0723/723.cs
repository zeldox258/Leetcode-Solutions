public class Solution {
    public int CandyCrush(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CandyCrush(root.left), CandyCrush(root.right));
    }
}