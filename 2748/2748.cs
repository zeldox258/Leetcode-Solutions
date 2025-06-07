public class Solution {
    public int NumberOfBeautifulPairs(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfBeautifulPairs(root.left), NumberOfBeautifulPairs(root.right));
    }
}