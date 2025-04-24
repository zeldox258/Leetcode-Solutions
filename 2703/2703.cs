public class Solution {
    public int ReturnLengthOfArgumentsPassed(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReturnLengthOfArgumentsPassed(root.left), ReturnLengthOfArgumentsPassed(root.right));
    }
}