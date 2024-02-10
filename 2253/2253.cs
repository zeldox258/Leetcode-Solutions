public class Solution {
    public int DynamicUnpivotingOfATable(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DynamicUnpivotingOfATable(root.left), DynamicUnpivotingOfATable(root.right));
    }
}