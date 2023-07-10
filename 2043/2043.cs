public class Solution {
    public int SimpleBankSystem(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SimpleBankSystem(root.left), SimpleBankSystem(root.right));
    }
}