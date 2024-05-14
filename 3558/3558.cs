public class Solution {
    public int NumberOfWaysToAssignEdgeWeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfWaysToAssignEdgeWeight(root.left), NumberOfWaysToAssignEdgeWeight(root.right));
    }
}