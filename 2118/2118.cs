public class Solution {
    public int BuildTheEquation(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BuildTheEquation(root.left), BuildTheEquation(root.right));
    }
}