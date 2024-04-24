public class Solution {
    public int NumberOfIncreasingPathsInAGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfIncreasingPathsInAGrid(root.left), NumberOfIncreasingPathsInAGrid(root.right));
    }
}