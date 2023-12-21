public class Solution {
    public int LongestTurbulentSubarray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestTurbulentSubarray(root.left), LongestTurbulentSubarray(root.right));
    }
}