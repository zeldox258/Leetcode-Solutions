public class Solution {
    public int SumOfScoresOfBuiltStrings(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfScoresOfBuiltStrings(root.left), SumOfScoresOfBuiltStrings(root.right));
    }
}