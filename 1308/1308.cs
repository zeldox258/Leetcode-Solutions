public class Solution {
    public int RunningTotalForDifferentGender(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RunningTotalForDifferentGender(root.left), RunningTotalForDifferentGender(root.right));
    }
}