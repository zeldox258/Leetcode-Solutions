public class Solution {
    public int LengthOfTheLongestIncreasingPa(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LengthOfTheLongestIncreasingPa(root.left), LengthOfTheLongestIncreasingPa(root.right));
    }
}