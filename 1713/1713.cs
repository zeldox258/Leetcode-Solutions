public class Solution {
    public int MinimumOperationsToMakeASubseq(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumOperationsToMakeASubseq(root.left), MinimumOperationsToMakeASubseq(root.right));
    }
}