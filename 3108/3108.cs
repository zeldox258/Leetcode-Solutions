public class Solution {
    public int MinimumCostWalkInWeightedGraph(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumCostWalkInWeightedGraph(root.left), MinimumCostWalkInWeightedGraph(root.right));
    }
}