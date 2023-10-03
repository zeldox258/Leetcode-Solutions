public class Solution {
    public int ValidPermutationsForDiSequence(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ValidPermutationsForDiSequence(root.left), ValidPermutationsForDiSequence(root.right));
    }
}