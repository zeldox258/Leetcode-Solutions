public class Solution {
    public int MinimumTimeToKillAllMonsters(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumTimeToKillAllMonsters(root.left), MinimumTimeToKillAllMonsters(root.right));
    }
}