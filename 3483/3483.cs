public class Solution {
    public int Unique3digitEvenNumbers(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(Unique3digitEvenNumbers(root.left), Unique3digitEvenNumbers(root.right));
    }
}