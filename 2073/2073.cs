public class Solution {
    public int TimeNeededToBuyTickets(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TimeNeededToBuyTickets(root.left), TimeNeededToBuyTickets(root.right));
    }
}