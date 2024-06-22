public class Solution {
    public int ChangeNullValuesInATableToTheP(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ChangeNullValuesInATableToTheP(root.left), ChangeNullValuesInATableToTheP(root.right));
    }
}