public class Solution {
    public int FindTheIndexOfTheLargeInteger(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheIndexOfTheLargeInteger(root.left), FindTheIndexOfTheLargeInteger(root.right));
    }
}