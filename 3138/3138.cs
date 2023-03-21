public class Solution {
    public int MinimumLengthOfAnagramConcaten(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumLengthOfAnagramConcaten(root.left), MinimumLengthOfAnagramConcaten(root.right));
    }
}