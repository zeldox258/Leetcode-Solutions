public class Solution {
    public int PreviousPermutationWithOneSwap(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(PreviousPermutationWithOneSwap(root.left), PreviousPermutationWithOneSwap(root.right));
    }
}