public class Solution {
    public int ConstructStringWithMinimumCost(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ConstructStringWithMinimumCost(root.left), ConstructStringWithMinimumCost(root.right));
    }
}