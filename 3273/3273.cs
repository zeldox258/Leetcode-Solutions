public class Solution {
    public int MinimumAmountOfDamageDealtToBo(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumAmountOfDamageDealtToBo(root.left), MinimumAmountOfDamageDealtToBo(root.right));
    }
}