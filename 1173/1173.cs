public class Solution {
    public int ImmediateFoodDeliveryI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ImmediateFoodDeliveryI(root.left), ImmediateFoodDeliveryI(root.right));
    }
}