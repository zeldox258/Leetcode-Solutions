public class Solution {
    public int MaximumPointsActivatedWithOneA(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumPointsActivatedWithOneA(root.left), MaximumPointsActivatedWithOneA(root.right));
    }
}