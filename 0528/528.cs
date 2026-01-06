public class Solution {
    public int RandomPickWithWeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RandomPickWithWeight(root.left), RandomPickWithWeight(root.right));
    }
}