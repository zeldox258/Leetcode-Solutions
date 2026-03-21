public class Solution {
    public int ConsecutiveAvailableSeats(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ConsecutiveAvailableSeats(root.left), ConsecutiveAvailableSeats(root.right));
    }
}