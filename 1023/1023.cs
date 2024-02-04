public class Solution {
    public int CamelcaseMatching(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CamelcaseMatching(root.left), CamelcaseMatching(root.right));
    }
}