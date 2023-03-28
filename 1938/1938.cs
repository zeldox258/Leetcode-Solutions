public class Solution {
    public int MaximumGeneticDifferenceQuery(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumGeneticDifferenceQuery(root.left), MaximumGeneticDifferenceQuery(root.right));
    }
}