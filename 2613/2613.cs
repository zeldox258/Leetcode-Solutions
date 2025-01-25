public class Solution {
    public int BeautifulPairs(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BeautifulPairs(root.left), BeautifulPairs(root.right));
    }
}