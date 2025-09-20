public class Solution {
    public int HighestSalariesDifference(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(HighestSalariesDifference(root.left), HighestSalariesDifference(root.right));
    }
}