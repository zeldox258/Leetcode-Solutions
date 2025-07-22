public class Solution {
    public int StatusOfFlightTickets(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(StatusOfFlightTickets(root.left), StatusOfFlightTickets(root.right));
    }
}