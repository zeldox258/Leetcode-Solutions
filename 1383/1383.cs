public class Solution {
    public int MaximumPerformanceOfATeam(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumPerformanceOfATeam(root.left), MaximumPerformanceOfATeam(root.right));
    }
}