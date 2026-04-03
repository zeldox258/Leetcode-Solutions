public class Solution {
    public int EarliestSecondToMarkIndicesI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(EarliestSecondToMarkIndicesI(root.left), EarliestSecondToMarkIndicesI(root.right));
    }
}