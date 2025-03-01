public class Solution {
    public int MinimumBitwiseOrFromGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumBitwiseOrFromGrid(root.left), MinimumBitwiseOrFromGrid(root.right));
    }
}