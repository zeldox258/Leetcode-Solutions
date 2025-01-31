public class Solution {
    public int FinalElementAfterSubarrayDelet(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FinalElementAfterSubarrayDelet(root.left), FinalElementAfterSubarrayDelet(root.right));
    }
}