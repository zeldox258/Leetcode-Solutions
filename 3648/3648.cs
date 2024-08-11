public class Solution {
    public int MinimumSensorsToCoverGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumSensorsToCoverGrid(root.left), MinimumSensorsToCoverGrid(root.right));
    }
}