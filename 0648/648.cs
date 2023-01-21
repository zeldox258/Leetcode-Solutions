public class Solution {
    public int ReplaceWords(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReplaceWords(root.left), ReplaceWords(root.right));
    }
}