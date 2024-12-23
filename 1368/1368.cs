public class Solution {
    public int MinimumCostToMakeAtLeastOneVal(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumCostToMakeAtLeastOneVal(root.left), MinimumCostToMakeAtLeastOneVal(root.right));
    }
}