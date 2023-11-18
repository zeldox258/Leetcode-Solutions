public class Solution {
    public int BagOfTokens(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BagOfTokens(root.left), BagOfTokens(root.right));
    }
}