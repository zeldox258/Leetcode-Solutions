public class Solution {
    public int MaxChunksToMakeSortedIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaxChunksToMakeSortedIi(root.left), MaxChunksToMakeSortedIi(root.right));
    }
}